package com.ngspringrolebasedlogin.backend.dominio;

import javax.persistence.*;

@MappedSuperclass
public class EntidadeBase {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(nullable = false)
   protected Long id;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (this.getId() != null ? this.getId().hashCode() : 0);

      return hash;
   }

   @Override
   public boolean equals(Object object) {
      if (this == object) {
         return true;
      }

      if (object == null) {
         return false;
      }

      if (getClass() != object.getClass()) {
         return false;
      }

      EntidadeBase other = (EntidadeBase) object;

      if (this.getId() != null && this.id.equals(other.id)) {
         return true;
      }
      return false;
   }
}

