import { Component, OnInit } from '@angular/core';
import { SbService } from '../sb.service';
import { DataService } from '../data.service';
import { Router } from '@angular/router';
import { CookieService } from 'ngx-cookie-service';

@Component({
  selector: 'app-send',
  templateUrl: './send.component.html',
  styleUrls: ['./send.component.scss']
})
export class SendComponent implements OnInit {
  cookieval = 'NONE';
  today: number = Date.now();

  constructor(private cookie:CookieService, private post:DataService, public nav:SbService, public router:Router) {
    this.cookieval = this.cookie.get("userId");

   }

  ngOnInit() {
    this.nav.show();
  }

  postMessage(event) {
    event.preventDefault()
    const target = event.target;
    const message = target.querySelector('#message').value;
    const memberid = this.cookieval;

    this.post.sendPost(memberid,message,this.today).subscribe(data => {
      if (JSON.stringify(data) != null){
        var parsedData = JSON.stringify(data);
        var obj = JSON.parse(parsedData);
        this.router.navigate(['/posts'])
      }
    })
  }
}
