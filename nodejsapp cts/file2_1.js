var fs=require('fs');
fs.open('readme.txt','r',(err,fd)=>{
    if(err){
        //console.log(err)
        console.log(err.message)
    }
    else {
        console.log('file opened in read mode');
     //   console.log(fd)
     console.log(fs.readFileSync('readme.txt').toString())
    }
 
    //fs.writeFileSync('input.txt','\nhello world\nhello world\nhello world');
     //console.log(fs.readFileSync('input.txt').toString())

})