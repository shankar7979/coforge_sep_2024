import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Book } from '../model/book';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private http:HttpClient) { 

  }
  getallbook():Observable<any>{
  // getallbook(){
     return this.http.get<Book[]>("http://localhost:3000/books")
  }
}
