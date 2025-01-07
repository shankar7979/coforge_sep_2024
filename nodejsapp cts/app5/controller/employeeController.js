//var dbConnection=require('./database/dbConnection')
var dbConnection=require('../database/dbConnection')

//export 
const getEmployee=(req,resp)=>{
  dbConnection.query('select * from employee',(err,result)=>{
    if(err)
        throw err
        resp.status(200).json(result)
  })
}

const getEmployeeById = (req, res) => {

    const id = parseInt(req.params.id);
    let sqlQuery = `select * from employee WHERE id = ${id}`;

    // This method verifies that the id passed by parameter is a number, if it is not, it sends an error message
    if (isNaN(id)) {
        return res.json('You must enter a valid id as a parameter');
    }

    dbConnection.query(sqlQuery, (error, result) => {
        if (error) throw error;
        res.status(200).json(result[0]);
    });
};


const createNewEmployee = (req, res) => {

    // Declare that I store the request body in a constant
    const employee = req.body;
    // So, I create the object with the table fields by calling the constant customer
    const employeeObj = [
        employee.id,
        employee.name,
        employee.salary,
    ];

    // This method verifies that the request body has all the complete fields, otherwise the operation will not be executed and sends an error message
    if (!employee.id || !employee.name || !employee.salary) {
        return res.json({
            ErrorCode: 204,
            Message: 'Fields cannot be empty'
        });
    }

    let sqlQuery = 'INSERT INTO employee (id, name, salary) VALUES ( ?,?,? )';

    dbConnection.query(sqlQuery, employeeObj, (err, result) => {
        if (err) throw err;
        res.status(201).json('employee created with id: ' + result.insertId);
    });
};

//module.exports=getEmployee
module.exports={ge:getEmployee,gei:getEmployeeById, gec:createNewEmployee}
