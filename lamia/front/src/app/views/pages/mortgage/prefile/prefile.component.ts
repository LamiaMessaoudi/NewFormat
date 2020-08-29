import { Component, OnInit } from '@angular/core';
import { ViewService } from '../view.service';



@Component({
  selector: 'kt-prefile',
  templateUrl: './prefile.component.html',
  styleUrls: ['./prefile.component.scss']
})
export class PrefileComponent  {
 
  listview:any[];
  listSections:any[];
  constructor(private v:ViewService ) { }

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
