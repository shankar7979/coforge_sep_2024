let -- block variable
var  -- global  variable
const -- making constant

interploation 

   `${}`
console object 

   debugging tool
      methods
         warn
         info
         error
         log
  REPL -- Read Eval Print Loop 

    Read user input
    Eval evaluates the data structure
    Print -- print the result
    Loop  -- it loops the above command command till ctrl+c is not pressed     

    Node Package Manager

        --> online repository
        --> install required Package

   --
      npm init   --initialise the project and add package.json

      to install any module add the command 

      npm install module_name
      npm i module_name

 two type of installation
   1.locally
   2.global

   npm i module_name -g  -- install globaly in your system

   npm ls-- list down all locally installed modules 

   uninstall  the module
   npm uninstall module_name


  npm search module  -- search online and display information if present 
  npm search mysql
  npm search express
  npm search live-server

  nodejs command line options
     node -v --- display the nodejs version
     node -h --- display the nodejs  help


 global object in nodejs 

    --dirname 
    --filename
    console 
    process
    buffer

    Os module 
    os.arch()
    os.cpus()


Time 
    setInterval
    setTimeout
    setImmediate

    clear time function
     clearImmediate()
     clearInterval()
     clearTimeOut()  

Errors
   1.Standard Javascript Errors 
     <EvalError>
     <SyntaxError>
     <RangeError>
     <ReferenceError>
     <TypeError>
     <URIError>
   2.System Errors
   3.User-Specific error
   4.Assertion Errors

   error handling is done by try catch 
   error handling is done by try catch and finally 
     finally gets executed if there is error or no error  
      using throw new Error('message')  -- throws error explicitly



   callback function
      pass one function as the argument of the another function 


  filesystem 
  
    var fs=require('fs')
    fs.readFile() -- asynchronous
    fs.readFileSync()  --synchronous

 open file 
   fs.open(path, flags[,mode],callback)
   flags -- r-- read 
            r+  read, write  -- exception if file is not present 
            rs  read in synchronous
            rs+ read, write in synchronous
            w   write mode file created if not present
            wx  write but fails if file/path  exists
            w+  read, write  file is created if not present 
            wx+  write
            a     append, file created if not present 
            ax+  read, append file will create if not present

     fs.stat  -- file information
      fs.stat(path,callback(error,stats))

      stats.isFile() -- true if file of simple type 
      stats.isDirectory()  -- true if file is of  Directory type

  Buffer 
         to store raw data(binary data) , raw memory outside v8 heap 

         buf=new Buffer(10) -- buffer of 10 octets
         buf=new Buffer([11,22,33,44]) -- buffer of array 
         buf=new Buffer("hello");

         buf.write(string,[,offset][,length][,encoding])


  Stream 
       object allows read data from source and write data to destination

      4 types 
        Readable  -- read operation
        Writable  -- write operation
        Duplex    -- both read write 
        Transform --  duplex type , output computed as of input 


        Each Stream is event emitter instance
          commonly events are 
             Data 
             End 
             Error 
             Finish 


             pipe streaming --
               pipe  from one source to other destination using pipe() methods
             chaining stream 
               chain of multiple streams 




Path module 

    to handle and transform files path. 

    methods
       normalize(p)-- normalize string path 
       join([path1]) -- join all paths 
       resolve([]) -- resolve absolute path 
       isabsolute(path) -- checks absolute path 
       dirname(path)  --  dir name of path 
       basename()    -- basename of the path 
       extname()     -- extension of the path 
       