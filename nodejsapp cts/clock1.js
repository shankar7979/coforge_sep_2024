// setInterval(()=>{
//     console.log(new Date().toLocaleTimeString())
// },1000)


// clock using recursion
function myclock(){
    console.log(new Date().toLocaleTimeString())
    setTimeout(myclock,1000)
}
//setTimeout(myclock,1000)

myclock();

