import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Counterapp1Component } from './counterapp1/counterapp1.component';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,CommonModule,Counterapp1Component],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angular_ngrx';
}
