//buf=new Buffer('hello world','utf-8')
buf=new Buffer('ಹಲೋ ವರ್ಲ್ಡ','utf-8')
// read by toString()
console.log(buf);
console.log(buf.toString());

buf1=new Buffer(10);
buf1.write('greeting');

console.log(buf1.toString());

//buf3=new Buffer([11,22,33]);
buf3=new Buffer('[11,22,33]');
console.log(buf3);
console.log(buf3.toString());

//parseInt(buf3.toString())

