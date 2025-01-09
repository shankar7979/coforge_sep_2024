var express = require('express')
var app = express()


app.get("/user/:id", (req, resp, next) => {
    if (req.params.id === '1')
        resp.send("for param 1 " + req.url)
    else
        next(),     // other than /user/:id will be processed by next middleware 

            (req, resp, next) => {
                resp.send("regular path " + req.params.id)// other than 0
            }
})


app.listen(3000)