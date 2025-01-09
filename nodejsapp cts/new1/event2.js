var events=require('events');
var emitter=new events.EventEmitter();

// listener for operation1, subscribed
// single subscriber
//emitter.once('addition',(a,b)=>{
emitter.on('addition',(a,b)=>{
    console.log('addition args  are ',a,b);
    //console.log(`addition of  ${a} and ${b} is ${a+b}`);
    console.log('addition of ',a, ' and ',b,' is ',(a+b))
})
// addition is event name, emit fires the addition event 
emitter.emit('addition',10,20);
emitter.emit('addition',1,2);
//emitter.emit('addition',11,222);

