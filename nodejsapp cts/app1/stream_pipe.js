var fs=require('fs');

var readstream=fs.createReadStream('hello.txt')
var writestream=fs.createWriteStream('greeting.txt');

readstream.pipe(writestream);
console.log('stream completed');
