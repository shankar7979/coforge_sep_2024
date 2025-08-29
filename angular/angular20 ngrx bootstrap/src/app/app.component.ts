import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Counterapp1Component } from './counterapp1/counterapp1.component';
import { CommonModule } from '@angular/common';
import { Parent1Component } from "./parentchild1/parent1/parent1.component";
import { Parent2Component } from "./parentchild2/parent2/parent2.component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, CommonModule, Counterapp1Component, Parent1Component, Parent2Component],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angular_ngrx';
}
