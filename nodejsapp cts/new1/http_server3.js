var http=require('http')
http.createServer((req,resp)=>{
    if(req.url=='/'){
    resp.write('<div style="border:solid;padding:20pt;margin:50pt;background:lime;color:blue">');
    resp.write('<h1>Home Page</h1>');
    resp.write('<br>path url'+req.url);
   // resp.write('<br>hostname '+req);
    resp.end('</div>');
    }
    if(req.url=='/about'){
    resp.write('<div style="border:solid;padding:20pt;margin:50pt;background:yellow;color:blue">');
    resp.write('<h1>About  Page</h1>');
    resp.write('<br>This is about page ');
    resp.end('</div>');
    }


}).listen(3000);

