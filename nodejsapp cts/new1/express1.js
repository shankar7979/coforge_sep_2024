var express=require('express')
var app=express()
app.get('/',function(req,resp){
    resp.write('<h1>hello express application</h1>')
    resp.end('end')
})

app.get('/user',function(req,resp){
    resp.write('<h1>User Application</h1>')
    resp.write("<p>Id: "+user.id+"</p>");
    resp.write("<p>Name: "+user.name+"</p>");
    resp.write("<p>salary: "+user.salary+"</p>");
    resp.write("<p>User: "+JSON.stringify(user)+"</p>");
    resp.end('end ')
})

app.listen(8000)

var user={
    "id":10001,
    "name":"surendra kumar",
    "salary":20000
}
