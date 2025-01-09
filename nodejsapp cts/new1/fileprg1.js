
var fs=require('fs')
var  data=fs.readFileSync('hello.txt');
console.log('using readFileSysn')
console.log(data.toString())


console.log('using readFile')

//fs.readFile('hello.txt', function(error,data){
fs.readFile('hello.txt', (error,data)=>{
  if(error)
    console.log(error);
  else 
  console.log(data.toString())
});


fs.writeFileSync('hello.txt',' i m fine');
var data='i m fine too' 
fs.writeFile('hello.txt',data, (error)=>{
    if(error){
        console.log(error)
    }
    else {
        console.log('file writeb operation is done')
    }
})

/* 

work with file in 2 ways
  synchronous way -- normal way-- readFileSync  
  
  asynchronous way -- special way -- callback function  
*/
