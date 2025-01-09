var http=require('http');

server=http.createServer((req,resp)=>{
resp.write("<div>hello</div>");
resp.write("<div>hello</div>");
resp.write("<div>hello</div>");
resp.write("<div>hello</div>");

})
server.listen(3000);