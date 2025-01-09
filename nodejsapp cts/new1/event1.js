var fs=require('fs');

rs=fs.createReadStream('hello.txt');
 
//implicit event listener 
rs.on('open',()=>{
    console.log('file is open');
})

// create eventlistner 
var events=require('events');
var emitter=new events.EventEmitter();

// listner for operation1, subscribed
emitter.on('operation1',()=>{
    console.log('operation1 started');
})
emitter.emit('operation1');
emitter.emit('operation1');


