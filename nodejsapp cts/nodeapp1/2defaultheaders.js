var http = require('http');

var server = http.createServer(function (req, res) {
    console.log('request headers...');
    console.log(req.headers);

    // respond
    //res.write(req.headers)
    //req.headers

   res.write('<h1> headers program</h1>')
   res.write(JSON.stringify(req.headers));
   res.write('<div>hello client!</div>');
  
//    req.headers.forEach(element => {
//      res.write(element)
//    });

    res.end();

}).listen(3000);
console.log('server running on port 3000');