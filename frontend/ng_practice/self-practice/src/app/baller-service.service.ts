import { Injectable } from '@angular/core';
import {Football} from '../app/model/Football'
@Injectable({
  providedIn: 'root'
})
export class BallerServiceService {

  constructor() { }

  football:Football;

  getMessage():String{
    this.football.message = 
  }
}
