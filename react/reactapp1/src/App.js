import Clock from "./CounterApp/Clock";
import Clock1 from "./CounterApp/Clock1";
import Counter from "./CounterApp/Counter";
import DatePrg from "./CounterApp/DatePrg";
import Customer from "./Customer";
import { address } from "./Form/data/Address";
import { Car } from "./Form/data/Car";
import EmployeeForm from "./Form/EmployeeForm";
import User from "./User";

function App(){
  return(
    <div>
      {/* <User></User> */}
      {/* <Counter></Counter> */}
      {/* <Customer country="india" myaddr={address}></Customer> */}
      {/* <Clock></Clock> */}
      {/* <DatePrg></DatePrg> */}
      {/* <Clock1></Clock1> */}
      <EmployeeForm myaddress={address} mycar={Car}></EmployeeForm>
      </div>
  )
}
export default App;























// import logo from './logo.svg';
// import './App.css';

// function App() {
//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Edit <code>src/App.js</code> and save to reload.
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header>
//     </div>
//   );
// }

// export default App;
