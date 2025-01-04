class employee{
    // constructor(){
    //     this.id=1001
    //     this.name="suresh parsad"
    //     this.salary=30000
    // }

//    constructor(id1, name1,salary1){
    constructor(id1=1, name1='suman parsad',salary1=90000){
        this.id=id1
        this.name=name1
        this.salary=salary1
    }

    getemp(){
        console.log('employee data')
        console.log('\tid '+this.id)
        console.log('\tname '+this.name)
        console.log('\tsalary '+this.salary)
    }
}
class manager  extends employee{

    constructor(id, name,salary,location, pf, hra ){
        super(id,name,salary)
        this.id=id
        this.name=name
        this.salary=salary
        this.location=location
        this.pf=pf
        this.hra=hra
    }
// method overriding
    getemp(){
        console.log('manager data')
        console.log('\tid '+this.id)
        console.log('\tname '+this.name)
        console.log('\tsalary '+this.salary)
        console.log('\tlocation '+this.location)
        console.log('\tpf '+this.pf)
        console.log('\thra '+this.hra)
        console.log('\tgross salary '+(this.salary-(this.salary*this.pf)+(this.salary*this.hra)))
    }
}

 emp1=new employee();
 emp1.getemp();

emp2=new employee(2006,'shyam sundar',45000);
emp2.getemp();

manager1=new manager(2001,'amitesh sundar',50000,'banglore',0.05,0.09);
manager1.getemp()