setInterval(() => {
   console.log('hello') 
}, 5000);

setTimeout(() => {
   console.log('some one is arrived at door') 
}, 3000);

var c=1;
hello=function(){
  console.log(c++);
}

setTimeout(hello, 1000);