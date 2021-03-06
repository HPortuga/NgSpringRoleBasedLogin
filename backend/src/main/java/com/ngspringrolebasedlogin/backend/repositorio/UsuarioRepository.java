package com.ngspringrolebasedlogin.backend.repositorio;

import com.ngspringrolebasedlogin.backend.dominio.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
