import { Component } from "react";

class EmployeeForm extends Component {

    constructor() {
        super();
        this.state = {
            "id": 0,
            "name": '',
            "salary": 0,
            "err_id": '',
            "err_name": '',
            "err_salary": ''
        }
    }

    changeId = (event) => {
        if (event.target.value == '')
            //alert('id is blank')
            this.setState({ 'err_id': 'id is blank' })
        else if (isNaN(event.target.value))
            this.setState({ 'err_id': 'id is not a number' })
    }

    changeName = (event) => {
        if (event.target.value != '')
            this.setState({ 'err_id': '' })
        else if (!isNaN(event.target.value))
            this.setState({ 'err_id': '' })
        if (event.target.value == '')
            //alert('name is blank')
            this.setState({ 'err_name': 'name is blank' })
    }

    changeSalary = (event) => {
        if (event.target.value != '')
            this.setState({ 'err_name': '' })

       else  if (event.target.value == '')
            this.setState({ 'err_salary': 'salary is blank' })
       
       else  if (event.target.value != '')
            this.setState({ 'err_salary': '' })
    }

    render() {
        return (
            <>
                <div className="container p-5 m-5 bg-success border w-75">
                    <div className="form-group">
                        <label>Enter Id</label>
                        <input className="form-control" onChange={this.changeId} onClick={this.changeId}></input>
                        <span className="text-warning">{this.state.err_id}</span>
                    </div>

                    <div className="form-group">
                        <label>Enter Name</label>
                        <input className="form-control" onChange={this.changeName} onClick={this.changeName}></input>
                        <span className="text-warning">{this.state.err_name}</span>
                    </div>
                    <div className="form-group">
                        <label>Enter Salary</label>
                        <input className="form-control" onChange={this.changeSalary} onClick={this.changeSalary}></input>
                        <span className="text-warning">{this.state.err_salary}</span>
                    </div>

                    <div className="form-group mt-2">
                        <input type="submit" className="btn btn-primary"></input>
                        <input type="reset" className="btn btn-primary" style={{ 'marginLeft': 10 }}></input>
                    </div>


                </div>
            </>
        )

    }

}
export default EmployeeForm;