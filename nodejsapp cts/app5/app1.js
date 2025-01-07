var express=require('express')
var app=express()
app.set('port',process.env.PORT||3000)
app.get("/",(req,resp)=>{
    resp.write("<h1>hello world at /</h1>")
    resp.end();
})

app.get("/hello",(req,resp)=>{
    resp.send("<h1>hello world at /hello</h1>");
});

app.listen(app.get('port'),()=>{
    console.log("Server started on port 3000")
})
