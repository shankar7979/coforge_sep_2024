import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {EmployeeComponent} from './employee/employee.component';
import {ChildComponent} from './child/child.component';
import {ParentComponent} from './parent/parent.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, EmployeeComponent,ParentComponent, ChildComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {

}
