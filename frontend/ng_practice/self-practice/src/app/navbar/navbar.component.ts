import { Component, OnInit } from '@angular/core';
import {Footballer} from './model/Footballer'

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  constructor() { }

  heading = 'Football App';
  
  ballerList = this.listBuilder();
  
  ngOnInit(): void {
  }

  ballerDetails;

  populateDetails(ballerDetails) {
    this.ballerDetails = ballerDetails;
  }


  styleCondition = (baller) => {
    return baller === this.ballerDetails ? 'select-button' : '';
  }


  listBuilder() : Footballer [] {
    let ballerList : Footballer[] = [{name:'Messi',age:34, goals:600},{name:'CR7',age:38, goals:700},{name:'Ribbery', age:40, goals: 500}];
    return ballerList;
  }

}
