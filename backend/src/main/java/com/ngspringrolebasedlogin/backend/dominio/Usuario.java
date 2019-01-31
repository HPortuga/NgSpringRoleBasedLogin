package com.ngspringrolebasedlogin.backend.dominio;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Usuario extends EntidadeBase {

   @Column
   private String username;

   @Column
   private String senha;

   @OneToMany(cascade = CascadeType.MERGE, mappedBy = "usuario")
   public List<Autoridade> autoridades;

   public Usuario(){}

   public Usuario(String username, String senha) {
      this.username = username;
      this.senha = senha;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getSenha() {
      return senha;
   }

   public void setSenha(String senha) {
      this.senha = senha;
   }

   public List<Autoridade> getAutoridades() {
      return autoridades;
   }

   public void setAutoridades(List<Autoridade> autoridades) {
      this.autoridades = autoridades;
   }

   public void addAutoridade(Autoridade autoridade) {
      this.autoridades.add(autoridade);
   }

   public void removeAutoridade(Autoridade autoridade) {
      this.autoridades.remove(autoridade);
   }
}
