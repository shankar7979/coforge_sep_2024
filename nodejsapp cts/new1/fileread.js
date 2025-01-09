var fs = require('fs')
var buffer = new Buffer(1024);

fs.open("fileprg1.js", "r", function (err, fd) {
    if (err) {
        console.log('some error '+err)
    }
    else {
        console.log('file opened successfully')
        fs.read(fd, buffer, 0, buffer.length, 0, function (err, bytes) {
            if (err) {
                console.log(err)
            }
            else {
                console.log(bytes)
            }
        })
    }

}) // r read only 
