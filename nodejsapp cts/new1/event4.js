// multiple subscriber for the event
var events=require('events');
var emitter=new events.EventEmitter();

var displayId=(id)=>console.log('id is '+id);
var displayName=(name)=>console.log('name is '+name);
var displaySalary=(salary)=>console.log('salary is '+salary);

emitter.on('event1',displayId)
emitter.on('event2',displayName)
emitter.on('event3',displaySalary)

//emitter.removeAllListeners();
emitter.removeListener('event3',displaySalary);

emitter.emit('event1',677676)
emitter.emit('event2','suman thakur')
emitter.emit('event3',560000)