var http=require('http')
var server=http.createServer((req,resp)=>{
   //resp.writeHead(200,{'content-type':'text/plain'});
   resp.writeHead(200,{'content-type':'text/html'});
   resp.write("<h1>Http Server Program</h1>");
   resp.write("<br>We are running html code");
   resp.end('<br>Bye');
   //resp.end('<br>Bye Bye');// will not displayed and may give error
})
server.listen(3000);