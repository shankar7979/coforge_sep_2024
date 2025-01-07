var eventEmitter=require('events').EventEmitter;

var emitter=new eventEmitter()

//emitter.removeListener('operation1');
var operation1Handler=()=>{
    emitter.removeListener('operation1',operation1Handler);
}

// emitter.on('operation1',operation1Handler,()=>{
//     console.log('subscriber1');

// });

emitter.on('operation1',()=>{
    console.log('subscriber1');
});

emitter.emit('operation1');
emitter.emit('operation1');
}
