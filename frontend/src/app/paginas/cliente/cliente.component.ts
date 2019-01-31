import { Component, OnInit } from '@angular/core';
import { AutoridadeService } from 'src/app/servicos/autoridade.service';

@Component({
  selector: 'app-cliente',
  templateUrl: './cliente.component.html',
  styleUrls: ['./cliente.component.scss']
})
export class ClienteComponent implements OnInit {

  constructor(private autoridadeService: AutoridadeService) { }

  ngOnInit() {
    this.autoridadeService.buscarTodos().subscribe(data => console.log(data));
  }

}
