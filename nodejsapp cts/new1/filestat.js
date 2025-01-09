var fs=require('fs')
fs.stat('hello.txt',(err,stat)=>{
    if(err)
        console.log('error '+err)
    else {
        console.log(stat.isFile()+' is a file');
        console.log(stat.isDirectory()+' is a Directory');
     if(stat.isFile()){
        fs.readFile('hello.txt',(err,data)=>{
            if(err)
                console.log(err)
            else 
            console.log(data.toString())
        })
     }
    }
})

