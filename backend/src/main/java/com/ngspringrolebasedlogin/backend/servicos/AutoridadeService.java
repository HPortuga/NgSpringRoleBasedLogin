package com.ngspringrolebasedlogin.backend.servicos;

import com.ngspringrolebasedlogin.backend.dominio.Autoridade;
import com.ngspringrolebasedlogin.backend.pojos.AutoridadeDTO;
import com.ngspringrolebasedlogin.backend.repositorio.AutoridadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AutoridadeService {
   private final AutoridadeRepository autoridadeRepository;

   @Autowired
   public AutoridadeService(AutoridadeRepository autoridadeRepository) {
      this.autoridadeRepository = autoridadeRepository;
   }

   public List<AutoridadeDTO> buscarTodos() {
      return this.autoridadeRepository.findAll().stream()
            .map(this::gerarDTO).collect(Collectors.toList());
   }

   public AutoridadeDTO gerarDTO(Autoridade autoridade) {
      return new AutoridadeDTO(autoridade.getId(), autoridade.getNome(), autoridade.getUsuario().getId());
   }
}
