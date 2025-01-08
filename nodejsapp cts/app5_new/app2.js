var express=require('express')
var app=express()
app.use(require('./routers/index'))
app.listen(8080)