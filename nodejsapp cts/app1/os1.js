//Os model 
// oerating system related memory and cpu vales 

var os=require('os');

var gb=1/Math.pow(1024,3);
console.log('gb  is '+gb);

//console.log('total memory '+os.totalmem())
console.log('total memory '+os.totalmem()*gb," GB");
console.log('free memory '+os.freemem()*gb," GB");
console.log('percent consumed memory ',100*(1-os.freemem/os.totalmem())," GB");
console.log('this pc has ',os.cpus().length," CPUS" )

console.log(os.cpus()[0])
console.log(os.cpus()[1])
console.log(os.cpus()[2])
console.log(os.cpus()[3])