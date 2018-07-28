import { Component, OnInit } from '@angular/core';
import { Router, NavigationEnd } from '@angular/router';
import { SbService } from '../sb.service';
@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.scss']
})

export class SidebarComponent implements OnInit {

  currentUrl: string;

  constructor(private router: Router, public nav:SbService) {
    router.events.subscribe((_: NavigationEnd) => this.currentUrl = _.url);
  } 

  ngOnInit() {
  }

}