var http = require('http')
var server = http.createServer((req, resp) => {

    resp.write(JSON.stringify(person));
    resp.write(JSON.stringify(person.id));
    resp.write(JSON.stringify(person.name));
    resp.end();

}).listen(3000)
var person={
    "id":10001,
    "name":"sambhu kumar"
}