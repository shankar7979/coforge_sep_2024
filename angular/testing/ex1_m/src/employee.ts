export class Employee{
    private _name: string;
    private _name1: string;

    public get name(): string {
        return this._name;
    }
    public set name(value: string) {
        this._name = value;
    }
}
