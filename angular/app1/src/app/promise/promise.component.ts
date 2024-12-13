import { Component } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-promise',
  standalone: true,
  imports: [],
  templateUrl: './promise.component.html',
  styleUrl: './promise.component.css'
})
export class PromiseComponent {

  hello() {
    fetchData()
      .then((data:any) => {
        alert('got data '+data.message)
        console.log(data.message); // Output: Data fetched successfully
      })
      .catch((error) => {
        console.error("Error:", error);
      });
  }
  hello1(){
    const subscription = fetchDataObservable().subscribe({
      next: (data:any) => {
        alert(data.message)
        console.log(data.message); // Output: Data fetched using Observable
      },
      error: (error) => {
        console.error("Error:", error);
      },
      complete: () => {
        alert("Observable complete")
        console.log("Observable complete");
      },
    });
    
    // Later, you can unsubscribe to release resources
   // subscription.unsubscribe();
  }
}

function fetchData() {

  return new Promise((resolve, reject) => {
    // Simulate an asynchronous operation
    setTimeout(() => {
      const data = { message: "Data fetched  with promise successfully" };
      resolve(data); // Resolve the promise with the data
    }, 2000);
  });
}

function fetchDataObservable() {
  return new Observable((observer) => {
    // Simulate an asynchronous operation
    setTimeout(() => {
      const data = { message: "Data fetched using Observable" };
      observer.next(data); // Emit a value
      observer.complete(); // Complete the observable
    }, 2000);
  });
}

