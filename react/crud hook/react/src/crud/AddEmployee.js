import React, { useEffect, useState } from "react";
import axios from "axios";

const AddEmployee = () => {

    const [employee, setEmployee] = useState({});
    const [msg, setMessage] = useState('');

    const handleForm = (e) => {
        console.log(employee);
        sendDataToPostAPI(employee);
        e.preventDefault();
    };

    const sendDataToPostAPI = (data) => {
        axios.post(`http://localhost:9090/employee`, data).then(
            (response) => {
                setMessage("Record Added")
                // alert("Record added")
            },
            (error) => {
                console.log(error);
                <p>Some error </p>

            }
        );
    };

    useEffect(() => {
        document.title = "Add Employee";
    }, []);

    return (
        <form className="bg-info p-5 m-5 w-75 form-group" onSubmit={handleForm}>
            <div>
                <label for="name">Employee Name</label>
                <input className="form-control"
                    onChange={(e) => {
                        setEmployee({ ...employee, name: e.target.value })
                    }}
                />
            </div>
            <div>
                <label>DOB</label>
                <input className="form-control" type="date"
                    onChange={(e) => {
                        setEmployee({ ...employee, dob: e.target.value })
                    }}
                />
            </div>
            
            <div>
                 {msg} 
            </div>

            <div>
                <button type="submit" style={{ marginRight: 5 }} className="btn btn-primary">Submit</button>
                <button type="reset" onClick={() => { setEmployee({ name: "", dob: "" }) }} style={{ marginLeft: 5 }} className="btn btn-primary">Reset</button>
            </div>
        </form>
    );
};

export default AddEmployee;