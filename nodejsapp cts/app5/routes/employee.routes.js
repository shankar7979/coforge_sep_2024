var express=require('express');
//const getEmployee  = require('../controller/employeeController');
const getEmployee  = require('../controller/employeeController');

var app=express()
var router=express.Router();
router.get("/",getEmployee.ge)
router.get('/id/:id', getEmployee.gei); //localhost:5000/customers/id/1
router.post('/add', getEmployee.gec); //localhost:5000/customers/id/1

module.exports = router;


