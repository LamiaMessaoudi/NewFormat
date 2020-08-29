import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MortgageComponent } from '../mortgage/mortgage.component';
import { PrefileComponent } from './prefile/prefile.component';
import { Routes, RouterModule} from '@angular/router';
import { HttpClientModule } from '@angular/common/http'; 
//import { BrowserModule } from '@angular/platform-browser';  


 


const routes: Routes = [
  {
    path: '',
    children: [
      {
        path:'prefile',
        component: PrefileComponent
      },
    ]
  }

]
@NgModule({
  declarations: [MortgageComponent, PrefileComponent],
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
    HttpClientModule  ,
    //BrowserModule

    
  ]
})
export class MortgageModule { }
