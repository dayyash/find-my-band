import { Component, OnInit, Input } from '@angular/core';
import { Router, NavigationEnd } from '@angular/router';
import { SbService } from '../sb.service';
import { CookieService } from 'ngx-cookie-service';
@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.scss']
})


export class SidebarComponent implements OnInit {
  cookieval = this.cookie.get("userId");
  currentUrl: string;

  // @Input string: def;

  

  constructor(private cookie:CookieService, private router: Router, public nav:SbService) {
    router.events.subscribe((_: NavigationEnd) => this.currentUrl = _.url);
     
  } 

  ngOnInit() {
    
  }

  logout(){
    this.cookie.deleteAll();
  }
}