var fs=require('fs');
var data=''

var readestream=  fs.createReadStream('hello.txt');
//var readestream=  fs.createReadStream('hello_decompressed.txt');
readestream.setEncoding('utf-8');

readestream.on('data', (chunk)=>{
  data+=chunk
})

readestream.on('end',()=>{
    console.log(data)
})
readestream.on('error',(err)=>{
    console.log(err)
})

