import { Component, OnInit } from '@angular/core';
import { ViewService } from './view.service';

@Component({
  selector: 'kt-mortgage',
  templateUrl: './mortgage.component.html',
  styleUrls: ['./mortgage.component.scss']
})
export class MortgageComponent implements OnInit {
listview:any[];
  constructor(private v:ViewService) { }

  ngOnInit() {
    this.getallview();
  }
  getallview(){
    this.v.getallview().subscribe(
      data=>{this.listview=data
    console.log(data)}
  
    )
  }
  }

