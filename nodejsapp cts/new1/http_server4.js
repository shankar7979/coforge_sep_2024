var http = require('http')
var server = http.createServer((req, resp) => {
    resp.write('<div style="border:solid;padding:20pt;margin:50pt;background:lime;color:blue">');
    resp.write('<h1>Request Headers</h1>');
    resp.write(JSON.stringify(req.headers));
    resp.end('</div>');
})
server.listen(3000)
