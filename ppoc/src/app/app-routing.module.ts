import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import { MemberComponent } from 'app/member/member.component';

const routes: Routes = [
  // {path: '', redirectTo: 'customer', pathMatch: 'full'},
  // {path: 'customer', component: CustomersComponent},
  // {path: 'add', component: CreateCustomerComponent},
  // {path: 'findbylastname', component: SearchCustomersComponent},
  {path: '', 
  children:[{
    path:'',
    component: MemberComponent
  },{
    path: 'membersearch', 
    //redirectTo:'',
    //pathMatch:'full'
    component: MemberComponent
  }]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule {}
