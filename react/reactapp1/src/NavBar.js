import { NavLink } from "react-router-dom"

export const NavBar=()=>{
    return(
         <div className="container">
                          <nav className="nav navbar-dark bg-light navbar-expand-sm">
                            <NavLink to='user' style={{"marginLeft":"50pt"}}>
                                      User 
                            </NavLink>
                            
                            <NavLink to='counter_hook' style={{"marginLeft":"50pt"}}>
                                      Counter-Hook
                            </NavLink>



                          </nav>
         </div>
    )
}