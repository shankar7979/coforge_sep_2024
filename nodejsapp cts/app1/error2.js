console.log('program starts ')
try{
var a=10
var b=20
var c=a+b 
console.log(`sum of ${a} and ${b} is ${c} `);
}
catch(e){
    console.log('error is '+e);
}
finally{
    console.log('finally executes');
}
console.log('program ends ')