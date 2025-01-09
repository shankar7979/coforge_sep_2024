var express = require('express')
var app = express()
app.use(express.json())

var myconnection = require('./database/dbConnection');

app.get("/", (req, resp) => {
    resp.send('employee crud app')
})
// show all
app.get("/employee", (req, resp) => {
    myconnection.query("select * from employee", (err, result) => {
        if (err) {
            resp.send(err)
            console.log(err)
        }
        else
            resp.json(result)
    })
})
// serach by id 
app.get("/employee/:id", (req, resp) => {
    var id = parseInt(req.params.id)
    myconnection.query("select * from employee where id=" + id, (err, result) => {
        if (err) {
            resp.send(err)
            console.log(err)
        }
        else
            resp.json(result)
    })
})
// add record 
app.post("/employee", (req, resp) => {
    const emp = {
        "id": req.body.id,
        "name": req.body.name,
        "salary": req.body.salary,
    }
    if(!emp.id)
        resp.status(400).send('id not present');
    else if(!emp.name)
        resp.status(400).send('name not present');
    else if(!emp.salary)
        resp.status(400).send('salary not present');
    else if(isNaN(emp.id))
        resp.status(400).send('id  is not a number');
    else if(isNaN(emp.salary))
        resp.status(400).send('salary  is not a number');
    else{
    myconnection.query("insert into employee values(" + emp.id + ",'" + emp.name + "'," + emp.salary + ")", (err, result) => {
        if (err) {
            if (err.code = 'ER_DUP_ENTRY')
                resp.status(403).send('duplicate id error');
        }
        resp.json(emp);
    })}
});

app.delete("/employee/:id", (req, resp) => {
    var id=parseInt(req.params.id)
    myconnection.query("delete from employee where id="+id,(err,result)=>{
        if(err)
            //throw err;
        resp.json('error '+err)
        else 
         resp.json('employee deleted')
    })
});
// update 
app.put("/employee", (req, resp) => {
    const emp = {
        "id": req.body.id,
        "name": req.body.name,
        "salary": req.body.salary,
    }
    if(!emp.id)
        resp.status(400).send('id not present');
    else if(!emp.name)
        resp.status(400).send('name not present');
    else if(!emp.salary)
        resp.status(400).send('salary not present');
    else if(isNaN(emp.id))
        resp.status(400).send('id  is not a number');
    else if(isNaN(emp.salary))
        resp.status(400).send('salary  is not a number');
    else{
    myconnection.query("update employee set name='" + emp.name + "', salary="+emp.salary+" where id="+emp.id), (err, result) => {
        if (err) {
           resp.send(err)
        }
        resp.json(emp);
    }  
    }
   }
)

app.listen(3000)
