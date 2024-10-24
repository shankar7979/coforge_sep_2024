import { Routes } from '@angular/router';
import { CalculatorComponent } from './calculator/calculator.component';
import { EmployeeComponent } from './employee/employee.component';
import { ReactiveformComponent } from './reactiveform/reactiveform.component';
import { TemplatedrivenComponent } from './templatedriven/templatedriven.component';
import { UserComponent } from './user/user.component';

export const routes: Routes = [
    {path:'',component:CalculatorComponent},
    {path:'calculator',component:CalculatorComponent},
    {path:'employee',component:EmployeeComponent},
    {path:'reactive',component:ReactiveformComponent},
    {path:'template',component:TemplatedrivenComponent},
    {path:'user',component:UserComponent},
];
