var express = require('express')
var app = express()


app.get("/user/:id", (req, resp, next) => {
    if (req.params.id === '0')
        next('route')// break out the route
    else next()
},
    (req, resp, next) => {
        resp.send("regular path "+req.params.id)// other than 0
    }
)

// next('route')
app.get("/user/:id", (req, resp, next) => {
    resp.send(" special " + req.params.id) // if 0 
}),

    app.listen(3000)