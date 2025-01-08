// npm i mysql
var mysql=require('mysql')
var connection=mysql.createConnection({
'host':'localhost',
'user':'root',
'password':'mysql',
'database':'cts1'
})
connection.connect((err)=>{
    if(err){
        console.log("there is error "+err)
    }
    else {
        console.log('connection sucessful')
        connection.query("insert into employee values(900007,'pankaj kumar',45000)",(err,result)=>{
           if(err){
            console.log('some error in insert '+err)
           }
           else {
            console.log(result.affectedRows+ ' record  added ')
           }
        }) 

        connection.query("select * from employee",(err,result,fields)=>{
            if(err)
            {
                console.log('error '+err)
            }
            else {
                //console.log(result)
                result.forEach(element => {
                    //console.log(element.id,", ",element.name,", ",element.salary)
                    console.log(element.id,"  " ,element.name,"   ",element.salary)
                 });
                connection.destroy()
            }
        });
    }
})
/*
//ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'mysql';
//flush privileges;
*/