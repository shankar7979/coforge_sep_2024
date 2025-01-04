function welcome(country){
    console.log('welcome you are from '+country)
}
addition=function(a,b){
    return a+b
}

function hello(name,callback,callback1){
    console.log('greeting '+name);
    callback('india');
    console.log('addition is '+callback1(10,20))
}
hello('shyam kumar',welcome,addition)

setInterval(() => {
     console.log('hello')
}, 1000);