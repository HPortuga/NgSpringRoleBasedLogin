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
}
