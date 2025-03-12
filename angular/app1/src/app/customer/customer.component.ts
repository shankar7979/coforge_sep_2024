import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule, NgIf } from '@angular/common';
import { Customer } from './model/customer';
import { ActivatedRoute, Route, Router } from '@angular/router';

@Component({
  selector: 'app-customer',
  standalone: true,
  imports: [
    FormsModule,
    CommonModule
  ],
  templateUrl: './customer.component.html',
  styleUrl: './customer.component.css'
})
export class CustomerComponent {
  @Input()  c:Customer;
  constructor(private route:ActivatedRoute, private router:Router) {
    this.c=new Customer();
  }

  onsubmit() {
    console.log(this.c)
    sessionStorage.setItem('country','india');
    console.log(sessionStorage.getItem('country')+'country setStorage ...');
       this.router.navigate(['/customerdata',{id:this.c.id,name:this.c.name,salary:this.c.salary}])
  }

}
// params subscribe
//http://localhost:4200/customerdata;id=21211;name=ram%20kumar;salary=12000
// route  {path:'customerdata',component:CustomerdataComponent},

