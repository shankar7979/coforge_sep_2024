var events=require('events')
var eventemitter=new events.EventEmitter();

eventemitter.on('eventName',(arg1,arg2)=>{
    console.log('eventName has args',arg1,arg2);
});
eventemitter.emit('eventName',{a:100},{b:200});
