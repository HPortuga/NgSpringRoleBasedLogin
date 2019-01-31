package com.ngspringrolebasedlogin.backend.pojos;

import java.util.List;

public class UsuarioDTO {
   private Long id;
   private String username;
   private String senha;
   private List<Long> autoridades;

   public UsuarioDTO() {}

   public UsuarioDTO(Long id, String username, String senha, List<Long> autoridades) {
      this.id = id;
      this.username = username;
      this.senha = senha;
      this.autoridades = autoridades;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
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

   public List<Long> getAutoridades() {
      return autoridades;
   }

   public void setAutoridades(List<Long> autoridades) {
      this.autoridades = autoridades;
   }
}
