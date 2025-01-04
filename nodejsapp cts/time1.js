date=new Date();
console.log(date)

console.log(date.toLocaleDateString())
console.log(date.toLocaleString())
console.log(date.toLocaleTimeString())

function alarm(){
    console.log('alarm is ringing')
}
console.log('alarm will ring after 10 second')
setTimeout(alarm,10*1000)

setTimeout(() => {
    console.log('lunch alarm')
}, 5*1000);

setInterval(() => {
    date=new Date();
    console.log(date.toLocaleTimeString())
}, 1000);