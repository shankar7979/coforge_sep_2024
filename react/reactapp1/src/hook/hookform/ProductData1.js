import { useLocation, useParams } from "react-router";

export const ProductData1 = () => {
    const { name } = useParams();
    const { state } = useLocation();

    
 return (
    <div className="container">

    <div>Name is  {state.data1.firstName}  {state.data1.lastName}   </div>
    <div>Email is  {state.data1.email}    </div>
    <div>age is  {state.data1.age}    </div>

    </div>
 )
}