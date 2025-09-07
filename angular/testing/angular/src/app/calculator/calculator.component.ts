import { Component } from '@angular/core';

@Component({
  selector: 'app-calculator',
  imports: [],
  templateUrl: './calculator.component.html',
  styleUrl: './calculator.component.css'
})
export class CalculatorComponent {
  constructor() {}

  ngOnInit(): void {}

  add(a: number, b: number): number {
    return a + b;
  }
}
