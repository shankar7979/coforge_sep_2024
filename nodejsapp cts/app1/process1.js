//process 

//process.argv 
console.log('all process argumentrs are')
console.log(process.argv)

//process.nextTick

process.nextTick(()=>{
    console.log('next tick')
})
console.log('immediate1')
console.log('immediate2')
console.log('immediate3')