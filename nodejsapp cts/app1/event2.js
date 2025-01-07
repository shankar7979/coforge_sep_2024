var eventEmitter=require('events').EventEmitter;

var emitter=new eventEmitter()

// subscribe 

emitter.on('operation1',(arg1,arg2)=>{
    console.log('Arags are ',arg1,arg2);
})
emitter.emit('operation1',{a:100},{b:200});
