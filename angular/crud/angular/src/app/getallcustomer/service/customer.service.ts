import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { Customer } from "../model/customer";
import { Injectable } from "@angular/core";

@Injectable({
    providedIn: 'root'
})

export class CustomerService {
    constructor(private http: HttpClient) {

    }

    getAllCustomer(): Observable<any> {
        return this.http.get("http://localhost:6060/customer");
    }

    addCustomer(c:Customer): Observable<Object> {
        return this.http.post("http://localhost:6060/customer",c);
    }
}