var fs=require('fs');
var rs=fs.createReadStream('event1.js');

rs.on('open',()=>{
    console.log('the file is open')
})