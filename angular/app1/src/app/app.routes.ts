import { Routes } from '@angular/router';
import { CalculatorComponent } from './calculator/calculator.component';
import { EmployeeComponent } from './employee/employee.component';
import { ReactiveformComponent } from './reactiveform/reactiveform.component';
import { TemplatedrivenComponent } from './templatedriven/templatedriven.component';
import { UserComponent } from './user/user.component';
import {Customer} from './templatedriven/model/customer';
import {CustomerComponent} from './customer/customer.component';
import { CustomerdataComponent } from './customerdata/customerdata.component';

export const routes: Routes = [
    {path:'',component:CalculatorComponent},
    {path:'calculator',component:CalculatorComponent},
    {path:'employee',component:EmployeeComponent},
    {path:'reactive',component:ReactiveformComponent},
    {path:'template',component:TemplatedrivenComponent},
    {path:'user',component:UserComponent},
    {path:'customer',component:CustomerComponent},
    {path:'customerdata',component:CustomerdataComponent},
];
