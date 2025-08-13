// AddEmployee.js
import React, { useState } from 'react';
import axios from 'axios'; // Example for API calls

function AddEmployee1() {
  const [employee, setEmployee] = useState({
    name: '',
    dob: '',
  });
  const [errors, setErrors] = useState({});

  const handleChange = (e) => {
    setEmployee({ ...employee, [e.target.name]: e.target.value });
  };

  const validateForm = () => {
    let newErrors = {};
    if (!employee.name.trim()) {
      newErrors.name = 'Name is required.';
    }

    if (!employee.dob.trim()) {
      newErrors.lastName = 'Last name is required.';
    }
    // Add more validation rules for email, phone, etc.
    setErrors(newErrors);
    return Object.keys(newErrors).length === 0; // Return true if no errors
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    if (validateForm()) {
      try {
        await axios.post('/api/employees', employee); // Replace with your API endpoint
        // Redirect or show success message
      } catch (error) {
        // Handle API errors
      }
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <input
        type="text"
        name="name"
        value={employee.name}
        onChange={handleChange}
        placeholder="Name"
      />
      {errors.Name && <span className="error">{errors.name}</span>}
      
      <input
        type="text"
        name="dob"
        value={employee.dob}
        onChange={handleChange}
        placeholder="Dob"
      />
      {errors.dob && <span className="error">{errors.name}</span>}

      <button type="submit">Add Employee</button>
    </form>
  );
}

export default AddEmployee1;