import { Component } from "react";

class Home extends Component {
    constructor() {
        super();
        this.state = {
            "id": "10001",
            "name": "sures prasad"
        }
    }
    render() {
        return (
            <div>
                <h1>This is My Home Component</h1>
                <div className="border border-light w-50 p-5 m-5">
                    <div>Id is {this.state.id}</div>
                    <div>Name is {this.state.name}</div>
                </div>

            </div>
        )
    }
}
export default Home;
