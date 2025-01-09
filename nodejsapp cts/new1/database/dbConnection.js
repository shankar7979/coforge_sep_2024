var mysql=require('mysql')
const  dbConnection=mysql.createConnection({
'host':'localhost',
'user':'root',
'password':'mysql',
'database':'cts1'
})
dbConnection.connect((err)=>{

    if(err){
        console.log("there is error "+err)
    }
})
module.exports=dbConnection
