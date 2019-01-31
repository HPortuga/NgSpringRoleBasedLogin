import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { API_URL } from '../app.constants';

@Injectable({
  providedIn: 'root'
})
export class AutoridadeService {

  constructor(private http: HttpClient) { }

  buscarTodos() {
    return this.http.get(API_URL + `/autoridade/todos`);
  }
}
