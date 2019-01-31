package com.ngspringrolebasedlogin.backend.servicos;

import com.ngspringrolebasedlogin.backend.dominio.Autoridade;
import com.ngspringrolebasedlogin.backend.repositorio.AutoridadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoridadeService {
   private final AutoridadeRepository autoridadeRepository;

   @Autowired
   public AutoridadeService(AutoridadeRepository autoridadeRepository) {
      this.autoridadeRepository = autoridadeRepository;
   }

   public List<Autoridade> buscarTodos() {
      return this.autoridadeRepository.findAll();
   }
}
