var connect=require('connect');
var app=connect().use((req,resp,next)=>{
   resp.write("hello world");
    next();

}).listen(3000)
console.log('running on 3000 port')