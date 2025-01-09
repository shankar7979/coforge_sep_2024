var buffer=new Buffer("this is nodejs  buffer                                ")

//console.log(buffer);
console.log(buffer.toString());
console.log('10 to 15',buffer.toString('utf-8',10,15));
console.log(buffer.length);

buffer.write('buffer is chunk of data.......  it can be mb kb ')

console.log("actual buffer ",buffer.toString());
console.log(buffer.length);

buffer.write('buffer is chunk of data.......  it can be mb kb ',5,10)

console.log(buffer.toString());
console.log(buffer);

buffer1=new Buffer('こんにちは世界');
console.log(buffer1.toString());

buffer2=new Buffer(545);
console.log(buffer2.toString());

buffer4=new Buffer(1);
buffer4[0]=97;
console.log(buffer4.toString('ascii'));
// create a buffer of 26 number and using it display all small alphabet