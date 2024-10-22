import { Component } from '@angular/core';
import { User } from './model/user';
import { data } from './data/userdata';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-user',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './user.component.html',
  styleUrl: './user.component.css'
})
export class UserComponent {
user:User;  
user1:User[];
constructor(){
  this.user=new User();
  this.user1=data;
}


}
