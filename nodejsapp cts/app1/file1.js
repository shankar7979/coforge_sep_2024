
var fs=require('fs')
// asynchronous read
console.log('read asynchronous way')

fs.readFile('input.txt',function(err,data){
    if(err){
        //console.log('error is '+err);
        console.log('error is '+err.message);
    }
    else 
    console.log(data.toString())
})
// read synchronous way
console.log('read synchronous way')
try{
var data=fs.readFileSync('test1.js');
console.log(data.toString())
}
catch(e){
    console.log('read synchronous way error '+e);
}