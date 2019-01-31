package com.ngspringrolebasedlogin.backend.repositorio;

import com.ngspringrolebasedlogin.backend.dominio.Autoridade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoridadeRepository extends JpaRepository<Autoridade, Long> {
}
