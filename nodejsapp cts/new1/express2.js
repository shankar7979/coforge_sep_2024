var express=require('express')
var app=express()
app.get('/',function(req,resp){
    resp.write('<h1>hello express application</h1>')
    
    resp.end('end')
})


var customer={
    "id":10001,
    "name":"sundar sharma",
    "location":"hyderabad",
    "dob":"10/10/2001",
    products:[
           {"prdid":1,"prdname":"book","qty":20,"cost":1200},
           {"prdid":2,"prdname":"book","qty":20,"cost":7890},
           {"prdid":3,"prdname":"book","qty":20,"cost":7890},
           {"prdid":4,"prdname":"book","qty":20,"cost":7890},
           {"prdid":5,"prdname":"book","qty":20,"cost":7890},
    ]
}