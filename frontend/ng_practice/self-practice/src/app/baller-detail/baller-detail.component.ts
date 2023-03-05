import { Component, Input, OnInit } from '@angular/core';
import {Footballer} from '../navbar/model/Footballer'

@Component({
  selector: 'app-baller-detail',
  templateUrl: './baller-detail.component.html',
  styleUrls: ['./baller-detail.component.css']
})
export class BallerDetailComponent implements OnInit {

  @Input() ballerDetails:Footballer

  constructor() { }

  ngOnInit(): void {
  }

}
