import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';
import { Observable } from 'rxjs';
import { SbService } from '../sb.service';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';
import { CookieService } from 'ngx-cookie-service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  

  constructor(private cookie:CookieService, private auth:AuthService, public nav: SbService, public router:Router) { }

  Object cook;
  
  ngOnInit() {

     this.nav.hide();
    console.log(this.cook);

  }

  loginUser(event) {
    event.preventDefault()
    const target = event.target;
    const username = target.querySelector('#username').value;
    const password = target.querySelector('#password').value;

    this.auth.authUser(username,password).subscribe(data => {
      if (JSON.stringify(data) != null){
        console.log(JSON.stringify(data));
        var parsedData = JSON.stringify(data);
        var obj = JSON.parse(parsedData);
        console.log(parsedData);
        this.cookie.set("userId", obj.id);

        console.log(obj.id);
        this.cook = obj.id;
        this.router.navigate(['/posts'])
      }
    })
  }
}
