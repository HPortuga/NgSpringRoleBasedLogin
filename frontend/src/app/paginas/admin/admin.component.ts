import { Component, OnInit } from '@angular/core';
import { UsuarioService } from 'src/app/servicos/usuario.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.scss']
})
export class AdminComponent implements OnInit {

  constructor(private usuarioService: UsuarioService) { }

  ngOnInit() {
    this.usuarioService.buscarTodos().subscribe(data => console.log(data));
  }

}
