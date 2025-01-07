var express=require('express')
var app=express()
var router=express.Router();

router.get("/",function(req,resp){
    resp.send("hello world");
})

router.get("/emp",function(req,resp){
    resp.send("hello world from emp end");
})

module.exports = router;
