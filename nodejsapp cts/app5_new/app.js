var process=require('process')
var express=require('express')
var app=express()
app.use("/",(req,resp)=>{
    resp.send("<h1>hello world</h1>")
})

app.listen(3000,()=>{
    console.log("Server started on port 3000")
    console.log(process.env.PORT)
})
