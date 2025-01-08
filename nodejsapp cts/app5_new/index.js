var express=require('express');
var app=express()

var empRoute=require('./routes/employee.routes');
//var router=express.Router();

app.use(express.json());
app.use(express.urlencoded( { extended:true } ) );

app.use('/employee', empRoute);

//router(app);
app.listen(3000);

// node index.js
//get 
// http://localhost:3000/employee/id/10001
// http://localhost:3000/employee
// http://localhost:3000/employee    --post 

/*

{
    "id":7979,
    "name":"abhishek",
    "salary":20000
}
*/
