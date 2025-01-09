// multiple subscriber for the event
var events=require('events');
var emitter=new events.EventEmitter();

var myaddition1=(a,b)=>{
    console.log('subscriber1 \naddition of ',a, ' and ',b,' is ',(a+b))
}

var myaddition2=(a,b)=>{
    console.log('subscriber2 \naddition of ',a, ' and ',b,' is ',(a+b))
}
var myaddition3=(a,b)=>{
    console.log('subscriber3 \naddition3 of ',a, ' and ',b,' is ',(a+b))
}
//3 subscribers for the event listener

emitter.on('addition',myaddition1);
emitter.on('addition',myaddition3);
emitter.on('addition',myaddition2);

//firing, calling the addition event
emitter.emit('addition',10,20);

