import { User } from "../src/user"

describe("use test...",()=>{
    const user=new User();
    user.id=878787;
    user.name="amit kumar";

    it("id and name test",()=>{
        expect(user.id).toEqual(878787)
        expect(user.name).toEqual("amit kumar")
    })
})