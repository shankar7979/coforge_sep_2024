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

    const employee = req.body;
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

 const updateEmployee = (req, res) => {
    
    const id = parseInt(req.params.id);
    const employee = req.body;
    const employeeObj = [
        employee.id,
        employee.name,
        employee.salary,
    ];

    if (isNaN(id)) {
        return res.json('You must enter a valid id as a parameter');
    }

    if (!employee.id || !employee.name || !employee.salary) {
        return res.json({
            ErrorCode: 204,
            Message: 'Fields cannot be empty'
        });
    }

    let sqlQuery = `UPDATE employee SET name = ?, salary = ? WHERE id = ${id}`

    dbConnection.query(sqlQuery, customerObj,  (error, result) => {
        if (error) throw error;
        if (result.affectedRow === 0) {
            res.send('No customer was updated');
        }
        res.json(`Customer with id ${id} updated successfully`);
    });
};


 const deleteOneEmployee = (req, res) => {

    const id = parseInt(req.params.id);

    if (isNaN(id)) {
        return res.json('You must enter a valid id as a parameter');
    }
    
    let sqlQuery = `DELETE FROM customers WHERE id = ${id}`;

    dbConnection.query(sqlQuery, error => {
        if (error) throw error; 
        res.status(200).json(`Employee with id ${id} deleted successfully`);
    });
};

 const deleteAllEmployee = (req, res) => {

    let sqlQuery = 'TRUNCATE TABLE employee';

    dbConnection.query(sqlQuery, error => {
        if (error) throw error; 
        res.status(200).json('All records have been erased');
    });
};



//module.exports=getEmployee
module.exports={ge:getEmployee,gei:getEmployeeById, cnew:createNewEmployee, 
    deli:deleteOneEmployee,delall:deleteAllEmployee,
upd:updateEmployee
}
