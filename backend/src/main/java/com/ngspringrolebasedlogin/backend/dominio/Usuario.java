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
}
