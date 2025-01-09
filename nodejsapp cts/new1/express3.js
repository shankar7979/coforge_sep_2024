var express=require('express')
var employee=require('./data/employee.json')
var app=express()

app.get('/',function(req,resp){
    resp.write('<h1>hello express application</h1>')
    resp.write(JSON.stringify(employee));
    resp.write("<br>Employee Data :");
    resp.write("<br>id :"+employee.id);
    resp.write("<br>name :"+employee.name);
    resp.write("<br>salary :"+employee.salary);

    resp.write("<br>Employee Address ");
    resp.write("<br>street :"+employee.address.street);
    resp.write("<br>location :"+employee.address.location);
    resp.write("<br>city :"+employee.address.city);
    resp.write("<br>pin :"+employee.address.pin);
    resp.write("<br>state :"+employee.address.state);
    resp.write("<br>country :"+employee.address.country);

    resp.end('end')
})

app.get('/home',function(req,resp){
    resp.send('<h1>Home Page</h1>')
})

app.get('/about',function(req,resp){
    resp.send('<h1>About Page</h1>')
})

app.listen(3000);
//npm i nodemon -g
// send= write+end