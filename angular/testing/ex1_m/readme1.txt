// src/Employee.ts

export class Employee {
  constructor(public name: string, public salary: number) {}

  getAnnualSalary(): number {
    return this.salary * 12;
  }

  raiseSalary(percentage: number): void {
    this.salary += this.salary * (percentage / 100);
  }
}
2. The Test File (Employee.test.ts)
This is where you'll write your tests using Jest and beforeEach.

TypeScript

// src/Employee.test.ts

import { Employee } from './Employee';

describe('Employee', () => {
  // Declare the variable for the instance here.
  // It's good practice to give it a type for clarity.
  let employee: Employee; 

  // The beforeEach hook. This code runs before *each* 'it' or 'test' block.
  beforeEach(() => {
    // A new, fresh instance of the Employee class is created.
    employee = new Employee('Alice', 60000);
  });

  it('should be created with a name and a salary', () => {
    // TypeScript ensures you can only access properties that exist on the Employee class.
    expect(employee.name).toBe('Alice');
    expect(employee.salary).toBe(60000);
  });

  it('should calculate the annual salary correctly', () => {
    const annualSalary = employee.getAnnualSalary();
    expect(annualSalary).toBe(720000);
  });

  it('should raise the salary by a given percentage', () => {
    // This test modifies the `employee` instance.
    employee.raiseSalary(10); // 10% raise
    expect(employee.salary).toBe(66000);

    // Because of `beforeEach`, the next test will still start with a salary of 60000.
  });

  it('should handle a 0% salary raise without changing the salary', () => {
    employee.raiseSalary(0);
    expect(employee.salary).toBe(60000);
  });
});
Key Points for TypeScript
Type Declarations: You can explicitly type your beforeEach variable (e.g., let employee: Employee;). This allows your IDE and compiler to provide excellent autocompletion and type-checking within the test file, catching errors before you even run the tests.

Importing: You must import the class you want to test at the top of your test file, just as you would in any other TypeScript file.

Setup and Teardown: The core function of beforeEach remains the same: it provides a fresh, isolated instance of the Employee class for every single test, preventing side effects and ensuring your tests are reliable and easy to understand.