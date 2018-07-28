import { Component, OnInit } from '@angular/core';
import { SbService } from '../sb.service';

@Component({
  selector: 'app-send',
  templateUrl: './send.component.html',
  styleUrls: ['./send.component.scss']
})
export class SendComponent implements OnInit {

  constructor(public nav:SbService) { }

  ngOnInit() {
    this.nav.show();
  }

}
