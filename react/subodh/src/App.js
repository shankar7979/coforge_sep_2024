import logo from './logo.svg';
import './App.css';
import Home from './home';
import User from './user/model/user';
import Counter1 from './Counter';

function App() {
  return (
    <div className="App border border-primary p-5 container bg-info" >
       <h1>Hello world</h1>
       <Home></Home>
       {/* <User></User> */}
       <Counter1></Counter1>
    </div>
  );
}

export default App;
