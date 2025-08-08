import {useState} from "react";

export const HookForm = () => {
    const [id, setId] = useState('')
    const [error, setError] = useState('')

    const submit=(event) => {
        event.preventDefault()
        if(!error) {
            //submit
        }
    }

    return (
        <div className="container">
            <form className="bg-info p-5 m-5 w-50 form-group" onSubmit={submit} >

            <h1>User Forms</h1>
            <div className="form-group">
                <label>Enter id</label>
                <input value={id} className="form-control w-50" onChange={
                    (event) => {
                        const value = event.target.value
                        setId(value)
                        if (value === '') {
                            alert('id is blank')
                            console.log('id is blank')
                            setError('id is blank')
                        } else {
                            setError('')
                        }
                    }
                }/>
                    </div>

                    <div>
                        {error && <p>{error}</p>}
                        <button type="submit" className="btn btn-primary w-25 mt-2">submit</button>
                    </div>
        </form>
</div>
)

}