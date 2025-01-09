var fs = require('fs')

fs.rename('welcome.txt', 'hello.txt', (err) => {
    if (err)
        console.log('there is error' + err)
    else {
        console.log('file renamed successfully')
        fs.readFile('hello.txt', (err, data) => {
            if (err)
                console.log('there is error' + err)
            else
                console.log(data.toString())
        })
    }
})