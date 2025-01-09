var fs=require('fs')

fs.unlink('hello.txt',(error)=>{
    if(error){
        console.log('file deletion error ',error.message)
    }
    else {
        console.log('deleted ')
    }
})

fs.readFile('hello.txt',(error,data)=>{
    if(error)
         console.log('read file error '+error.message)
        else 
        console.log(data.toString())
})

fs.open("path","r") // r read only 
fs.open("path","r+")// r+ read and write 
fs.open("path","rs")// rs read in synchronous mode

fs.open("path","w");// w- writing 