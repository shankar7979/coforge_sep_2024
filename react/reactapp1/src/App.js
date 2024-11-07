//import {Clock} from "./hook/Clock";
import {Clock1} from "./hook/Clock1";
//import Clock1 from "./CounterApp/Clock1";
import DatePrg from "./CounterApp/DatePrg";
import Customer from "./Customer";
import { address } from "./Form/data/Address";
import { Car } from "./Form/data/Car";
import EmployeeForm from "./Form/EmployeeForm";
import {Counter} from "./hook/Counter";
import  Counter1 from "./CounterApp/Counter"
import { phone } from "./hook/data/userphone";
import User from "./User";
import { EmployeeForm1 } from "./hook/EmployeeForm";
import { ProductForm } from "./hook/hookform/ProductForm";
import { BrowserRouter, Route,  Routes } from "react-router-dom";
import { NavBar } from "./NavBar";
import { ProductData } from "./hook/hookform/ProductData";

function App(){
  return(
    <div>
      {/* <User></User> */}
      {/* <Counter></Counter> */}
      {/* <Customer country="india" myaddr={address}></Customer> */}
      {/* <Clock></Clock> */}
      {/* <DatePrg></DatePrg> */}
      {/* <Clock1></Clock1> */}
      {/* <EmployeeForm myaddress={address} mycar={Car}></EmployeeForm> */}
      {/* <Counter myphone={phone} myaddress={address}></Counter> */}
      {/* <Clock1></Clock1> */}
     {/* <Clock></Clock>  */}
      {/* <EmployeeForm></EmployeeForm> */}
     {/* <ProductForm></ProductForm> */}

     <BrowserRouter>
      <NavBar></NavBar>
      <Routes>
        <Route path="/" element={<User></User>}></Route>
        <Route path="/user" element={<User></User>}></Route>
        <Route path="/counter_hook" element={<Counter myphone={phone} myaddress={address}></Counter>}></Route>
        <Route path="/counter_class" element={<Counter1></Counter1>}></Route>
        <Route path="/empform_class" element={<EmployeeForm myaddress={address} mycar={Car}></EmployeeForm>}></Route>
        <Route path="/empform_hook" element={<EmployeeForm1></EmployeeForm1>}></Route>
        <Route path="/prdform" element={<ProductForm></ProductForm>}></Route>
        {/* <Route path="/prd_data/:fname/:lname/:age/:email" element={<ProductForm></ProductForm>}></Route> */}
        {/* <Route path="/prd_data/:fname" element={<ProductData></ProductData>}></Route> */}
        <Route path="/prd_data" element={<ProductData></ProductData>}></Route>
      </Routes>

     </BrowserRouter>
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
