import {AppRoutingModule} from './app-routing.module';
import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HttpModule} from '@angular/http';

import {AppComponent} from './app.component';
import {MemberdataService} from './memberdata.service';

import {enableProdMode} from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


import { AccordionModule,
  BreadcrumbModule,
  ButtonModule,
  CaptchaModule,
  CheckboxModule,
  DataTableModule,
  DialogModule,
  DropdownModule,
  FieldsetModule,
  InputMaskModule,
  InputTextModule,
  MessagesModule,
  MultiSelectModule,
  PanelModule,
  RadioButtonModule,
  TabViewModule } from 'primeng/primeng';
import { MemberComponent } from './member/member.component';

@NgModule({
  declarations: [
    AppComponent,
    MemberComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    //primeNG
    AccordionModule,
    BreadcrumbModule,
    ButtonModule,
    CaptchaModule,
    CheckboxModule,
    DataTableModule,
    DialogModule,
    DropdownModule,
    FieldsetModule,
    InputMaskModule,
    InputTextModule,
    MessagesModule,
    MultiSelectModule,
    PanelModule,
    RadioButtonModule,
    TabViewModule,
  ],
  providers: [MemberdataService],
  bootstrap: [AppComponent]
})
export class AppModule {}
