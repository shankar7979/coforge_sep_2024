const { error } = require('console');
var fs=require('fs');
 fs.stat('input.txt',(error,stats)=>{
    if(error){
        console.log(error)
    }
    //console.log(stats);
    console.log(stats.isFile());
    console.log(stats.isDirectory());
    

 })