import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }


  authUser(username,password) {
    return this.http.post('http://localhost:8081/api/member/three',{"username":username,"password":password})
  }
}
