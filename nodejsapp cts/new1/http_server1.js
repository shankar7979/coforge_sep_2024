var http=require('http')

http.createServer(function(req,resp){

    resp.write("<h1>Hello world</h1>");
    resp.write("<h1>Hello world</h1>");
    resp.write("<h1>Hello world</h1>");
    resp.write("<h1>Hello world</h1>");

}).listen(2000);
console.log('running on port 3000');
// locahost -- 127.0.0.l