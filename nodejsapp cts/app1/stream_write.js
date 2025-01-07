var fs=require('fs');
var data='we are learning stream in nodejs'
var writestream=fs.createWriteStream('welcome.txt');
writestream.write(data,'UTF8')
writestream.end()

writestream.on('finish',()=>{
    console.log('completed')
})

writestream.on('error',(err)=>{
    console.log('error'+err)
})


