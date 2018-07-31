import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class DataService {  

  constructor(private http: HttpClient) { }

  getUsers() {
    return this.http.get('http://localhost:8081/api/member/two')
  }

  getUser(userId) {
    return this.http.get('http://localhost:8081/api/member/four?id='+ userId)
  }

  getPosts() {
    return this.http.get('http://localhost:8081/api/posts/two')
  }

  sendPost(memberId, message,timestamp) {
    return this.http.post('http://localhost:8081/api/posts/one',{"memberid":memberId, "message":message, "timestamp":timestamp})
  }
}
