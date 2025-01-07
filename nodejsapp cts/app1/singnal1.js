setTimeout(() => {
    console.log('after 5 second it will exit ')
}, 5000);

process.on('SIGINT',()=>{
    console.log('receive SIGINT  but ignored')
})

// press Ctrl +C to run and give signal SIGINT
/*
 Node js process suppprts signal as of unix  system
 signal - inter process communication


 Ctsr+C -- SIGINT  -- singnal interrupt 
 
*/

