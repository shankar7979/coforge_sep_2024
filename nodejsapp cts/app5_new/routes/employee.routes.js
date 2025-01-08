var express=require('express');
//const getEmployee  = require('../controller/employeeController');
const getEmployee  = require('../controller/employeeController');

var app=express()
var router=express.Router();
router.get("/",getEmployee.ge)
router.get('/id/:id', getEmployee.gei); //localhost:5000/customers/id/1
router.post('/add', getEmployee.cnew); //localhost:5000/customers/id/1
router.delete('/deletebyId', getEmployee.deli); //localhost:5000/customers/id/1
router.delete('/deleteall', getEmployee.delall); //localhost:5000/customers/id/1
router.put('/update', getEmployee.upd); //localhost:5000/customers/id/1

module.exports = router;


