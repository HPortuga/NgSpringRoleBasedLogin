import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import {HttpClientModule} from "@angular/common/http";
import { AppComponent } from './app.component';
import { HomeComponent } from './paginas/home/home.component';
import { LoginComponent } from './paginas/login/login.component';
import { AdminComponent } from './paginas/admin/admin.component';
import { ClienteComponent } from './paginas/cliente/cliente.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    AdminComponent,
    ClienteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
