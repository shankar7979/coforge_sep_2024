var eventEmitter=require('events').EventEmitter;

var emitter=new eventEmitter()

// subscribe 
// on method Adds the listener function to the end of the listeners array for the event named eventName
emitter.on('operation1',()=>{
    console.log('subscriber1');
})

emitter.on('operation1',()=>{
    console.log('subscriber2');
})

emitter.on('operation1',()=>{
    console.log('subscriber3');
})

//emitter.removeAllListeners()
//emit method Synchronously calls each of the listeners registered for the event named eventName, 
//in the order they were registered, passing the supplied arguments to each.
emitter.emit('operation1');


