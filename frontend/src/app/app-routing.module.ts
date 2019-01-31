import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './paginas/home/home.component';
import { AdminComponent } from './paginas/admin/admin.component';
import { ClienteComponent } from './paginas/cliente/cliente.component';
import { LoginComponent } from './paginas/login/login.component';

const routes: Routes = [
  {path: "", component: HomeComponent},
  {path: "home", component: HomeComponent},
  {path: "login", component: LoginComponent},
  {path: "cliente", component: ClienteComponent},
  {path: "admin", component: AdminComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
