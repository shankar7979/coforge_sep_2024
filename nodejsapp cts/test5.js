var employee={
    id:10001,
    name:'suresh kumar',
    age:25,
    address:[
          {
            'city':'chennai',
            'location':'thoraipakkam',
            'state':'tamilnadu',
            'country':'india'
          },
          
          {
            'city':'mathura',
            'location':'gokul',
            'state':'uttar pardesh',
            'country':'india'
          }
    ],
    empData(){
        return 'employee id : '+employee.id+'\nname : '+employee.name+'\nage: '+employee.age
    },

    empaddress1(){
      return 'adrress1\ncity'+this.address[0].city+'\nlocation:'+this.address[0].location+'\nstate :'+this.address[0].state+
      '\ncountry :'+this.address[0].country
    }
}

//console.log(employee)

//console.log('employee data')
//console.log(employee.empData())

//console.log('employee1 address')
//console.log(employee.empaddress1())
console.log('employee id : '+employee.id+'\nname : '+employee.name+'\nage: '+employee.age)
console.log('addresses')
// for of loop
 for (const add of employee.address) {
    console.log('\tcity '+add.city) 
    console.log('\tlocation '+add.location) 
    console.log('\tstate '+add.state) 
    console.log('\tcountry '+add.country) 
    }

