var fs=require('fs');
fs.unlink('input.txt',(error)=>{
    if(error){
        console.log('some error '+error)
    }
    else {
        console.log('file deleted successfully');
    }
})