var http=require('http');
var fs=require('fs');


http.createServer((req,resp)=>{
    resp.writeHead(200,{'content-type':'text/html'});
    resp.write('<h1>Hello World</h1>');
    fs.createReadStream('./public/index.html').pipe(resp);

}).listen(3000)