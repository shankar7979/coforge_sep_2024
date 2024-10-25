import { Component } from '@angular/core';
import { Customer } from '../getallcustomer/model/customer';
import { CustomerService } from '../getallcustomer/service/customer.service';
import { Observable } from 'rxjs';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addcustomer',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './addcustomer.component.html',
  styleUrl: './addcustomer.component.css'
})
export class AddcustomerComponent {
  c: Customer;
  msg: string = '';
  data1:string='';
  visible: boolean = false;
  constructor(private service: CustomerService, private route:Router) {
    this.c = new Customer();
  }
  addRecord() {
    this.visible = true;
    this.service.addCustomer(this.c).subscribe(
      data => {
        this.msg = 'Record added',
        this.data1=JSON.stringify(data)  
      // Object.entries(this.data1).forEach(([key,value]) => {
      //   console.log(key,value);
      // });
      }
      , error =>
        this.msg = error.error
    );
  }

  showAll(){
    this.route.navigate(['/all customer'])
  }
}
