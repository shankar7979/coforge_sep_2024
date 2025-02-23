var mysql = require('mysql');
var express = require('express')
var app = express()
app.use(express.json())
//mysql> create database nodedb;
//create table employee(id int primary key, name varchar(20), salary float);
//error   Error: ER_NOT_SUPPORTED_AUTH_MODE: Client does not support authentication protocol requested by server; consider upgrading MySQL client
//ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'mysql';
//flush privileges;
var connection = mysql.createConnection(
    {
        host: 'localhost',
        user: 'root',
        password: 'mysql',
        database: 'nodedb'
    }
);
connection.connect((err) => {
    if (err)
        throw err;
})

app.get("/employee", (req, resp) => {
    connection.query("select * from employee", (err, result) => {
        if (err)
            //throw err;
            resp.send(err)
        else
            resp.json(result);
    })
})
app.get("/employee/:id", (req, resp) => {

    if (!req.params.id)
        resp.status(404).send('id is not present')

    else if (isNaN(req.params.id))
        resp.status(404).send('id is not a number')
    else {
        var id = parseInt(req.params.id)
        connection.query("select * from employee where id=" + id, (err, result) => {
            if (err)
                throw err;

            else
                resp.json(result);
        })
    }
})
app.post("/employee", (req, resp) => {
    const emp = {
        "id": req.body.id,
        "name": req.body.name,
        "salary": req.body.salary,
    };
    if (!emp.id)
        resp.status(400).send('id is not present ')
    else if (!emp.name)
        resp.status(400).send('name is not present ')
    else if (!emp.salary)
        resp.status(400).send('salary is not present ')
    else {
        connection.query("insert into employee values(" + emp.id + ",'" + emp.name + "'," + emp.salary + ")", (err, result) => {
            if (err) {
                if (err.code = 'ER_DUP_ENTRY')
                    resp.status(403).send('duplicate  id error')
            }
            else
                resp.json(emp);
        }
        );
    }
});
app.delete("/employee/:id", (req, resp) => {
    if (!req.params.id)
        resp.status(404).send('id is not present')

    else if (isNaN(req.params.id))
        resp.status(404).send('id is not a number')
    else {
        var id = parseInt(req.params.id)
        var emp1;
        connection.query("select * from employee where id=" + id, (err, result) => {
            emp1 = result;
        }),

            connection.query("delete  from employee where id=" + id, (err, result) => {
                if (err)
                    throw err;
                else {
                    console.log(emp1)
                    resp.json(emp1);
                }
            }
            )
    }
})
app.put("/employee", (req, resp) => {
    const emp = {
        "id": req.body.id,
        "name": req.body.name,
        "salary": req.body.salary,
    };
    if (!emp.id)
        resp.status(400).send('id is not present ')
    else if (!emp.name)
        resp.status(400).send('name is not present ')
    else if (!emp.salary)
        resp.status(400).send('salary is not present ')
    else {
        //connection.query("update employee  set name='"+emp.name+"',salary="+emp.salary+" where id="+emp.id+" "),(err,result)=>
        connection.query("update employee  set name='" + emp.name + "',salary=" + emp.salary + " where id=" + emp.id + " ", (err, result) => {
            if (err)
                resp.send(err)
            else
                resp.json(emp);
        })
    }
}
)


app.listen(8000);

/*
http://localhost:8000/employee
post 
{
   "id":"1001",
	"name":"ram kumar",
	"salary":2000
}

http://localhost:8000/employee
put 
{
   "id":"1001",
	"name":"ramesh kumar",
	"salary":90000
}
  
http://localhost:8000/employee/1001
delete 

http://localhost:8000/employee/1001
get  - search

http://localhost:8000/employee
get -- getall

*/