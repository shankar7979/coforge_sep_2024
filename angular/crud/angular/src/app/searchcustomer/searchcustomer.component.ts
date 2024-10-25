import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-searchcustomer',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './searchcustomer.component.html',
  styleUrl: './searchcustomer.component.css'
})
export class SearchcustomerComponent {

}
