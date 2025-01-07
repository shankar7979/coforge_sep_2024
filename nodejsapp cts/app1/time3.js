
var id1=setInterval(() => {
    console.log('hello') 
 }, 1000);

var id2=setInterval(() => {
    console.log('welcome') 
 }, 1000);

 //clearInterval(id1);
 
 var id3=setTimeout(()=>{
    console.log('alarm is ringing')
 },
  4000
)
clearTimeout(id3)
