export const Clock1 = () => {
    return (
        <div>
            <div onLoad={()=>setInterval(new Date().toLocaleTimeString(),1000)}>{
                new Date().toLocaleTimeString()
                }</div>
        </div>
    )
}