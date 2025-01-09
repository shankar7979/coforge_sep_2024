var myconnection=require('./database/dbConnection');


var http=require('http');
http.createServer((req,resp)=>{

    resp.write('<h1>Employee Table</h1>');

    myconnection.query("select * from employee",(err,result,fields)=>{
        if(err)
        {
           resp.write('error '+err)
        }
        else {
            //console.log(result)
            resp.write("<style>table {background:pink;margin-left:200pt;padding:20pt;border:double blue} td{border:solid}</style>");
            resp.write("<table>")
            resp.write("<tr><th>id</th><th>name</th><th>salary</th></tr>")

            result.forEach(element => {
                //resp.write("<br>"+element.id+"  "+element.name+"   "+element.salary)
                resp.write("<tr><td>"+element.id+"</td><td>  "+element.name+"</td><td>   "+element.salary+"</td></tr>")
             });
             resp.write("</table>")
             
            myconnection.destroy()
        }
    });

}).listen(3000)



