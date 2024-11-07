import { NavLink } from "react-router-dom"

export const NavBar = () => {
  return (
    <div className="container">
      <nav className="nav navbar-dark bg-light navbar-expand-sm">
        <NavLink to='user' style={{ "marginLeft": "50pt" }}>
          User
        </NavLink>

        <NavLink to='counter_hook' style={{ "marginLeft": "50pt" }}>
          Counter-Hook
        </NavLink>
        <NavLink to='counter_class' style={{ "marginLeft": "50pt" }}>
          Counter class
        </NavLink>


        <NavLink to='prdform' style={{ "marginLeft": "50pt" }}>
          Product Hook Form
        </NavLink>

        <NavLink to='empform_class' style={{ "marginLeft": "50pt" }}>
          Employee Form(class)
        </NavLink>

        <NavLink to='empform_hook' style={{ "marginLeft": "50pt" }}>
          Employee Form(hook)
        </NavLink>

        <NavLink to='prd_data' style={{ "marginLeft": "50pt" }}>
          Product Data
        </NavLink>



      </nav>
    </div>
  )
}