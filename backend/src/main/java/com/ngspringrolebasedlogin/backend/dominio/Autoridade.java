package com.ngspringrolebasedlogin.backend.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Autoridade extends EntidadeBase {

   @Column
   private String nome;

   @ManyToOne
   @JoinColumn(name = "usuario_id")
   private Usuario usuario;

   public Autoridade(){}

   public Autoridade(String nome) {
      this.nome = nome;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public Usuario getUsuario() {
      return usuario;
   }

   public void setUsuario(Usuario usuario) {
      this.usuario = usuario;
   }
}
