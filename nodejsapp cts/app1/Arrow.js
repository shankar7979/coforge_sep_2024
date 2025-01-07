function addition(a,b){
    return a+b
}

// anonymous function
addition1=function(a,b){
  return a+b
}

addition2=(a,b)=> a+b

console.log('sum id '+addition2(11,22));

ar1=[11,2,1,3,4]
// using map 
ar2=ar1.map((a)=>a*a)
ar2=ar1.map(a=>a*a)
console.log(ar2);

//using filter 
console.log(ar1.filter((a)=> a%2==0))
console.log(ar1.filter(a=> a%2==0))

//using reduce 
console.log('sum is '+ar1.reduce((a,b)=> a+b))

ar2.forEach(a => {
    console.log(a)
});
console.log(ar2.sort((a,b)=>a-b))

