import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ViewService {
url='http://localhost:8080/views';
  constructor(private http:HttpClient) { }
  getallview(){
    return this.http.get<any>(this.url);
  }
}
