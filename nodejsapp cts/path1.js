var path=require('path');
var completepath='welcome/greeting/employee.js'
var completepath1='welcome/greeting/'


console.log('directory name '+path.dirname(completepath))
console.log('base  name '+path.basename(completepath))
console.log('extension name '+path.extname(completepath))
console.log(path.join(completepath1,'test1/test2','user1'))