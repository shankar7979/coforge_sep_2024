var fs=require('fs')

fs.appendFile('hello.txt','this will be appended\n',(err)=>{
    if(err){
        console.log(err)
    }
    else {
        console.log('content added')
    }
})