import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Customer } from '../customer/model/customer';

@Component({
  selector: 'app-customerdata',
  standalone: true,
  imports: [],
  templateUrl: './customerdata.component.html',
  styleUrl: './customerdata.component.css'
})
export class CustomerdataComponent {
  id1:number=0;
  name1:string='';
  salary1:number=0;
  country:any='';
  constructor(private router: Router, private route: ActivatedRoute) {
  }
  ngOnInit(): void{
    //this.country=
    this.country=sessionStorage.getItem('country')
    this.route.params.subscribe(params => {
      this.id1 = params['id']
      this.name1 = params['name']
      this.salary1 = params['salary']
//      console.log("data is "+JSON.stringify(this.data))
    });
  }

}
