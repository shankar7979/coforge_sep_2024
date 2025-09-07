import { Employee } from "../src/employee"
 let emp:Employee
describe("employee test",()=>{
    beforeEach(()=>{
        emp=new Employee();
        emp.name="ram kumar"
    })

    it("name equals ",()=>{
      expect(emp.name).toEqual("ram kumar")
    })
})

describe("employee test",()=>{
    emp=new Employee();
    emp.name="amit kumar"

it("name equals ",()=>{
  expect(emp.name).toEqual("amit kumar")
})
})