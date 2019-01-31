package com.ngspringrolebasedlogin.backend.servicos;

import com.ngspringrolebasedlogin.backend.dominio.EntidadeBase;
import com.ngspringrolebasedlogin.backend.dominio.Usuario;
import com.ngspringrolebasedlogin.backend.pojos.UsuarioDTO;
import com.ngspringrolebasedlogin.backend.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {
   private final UsuarioRepository usuarioRepository;

   @Autowired
   public UsuarioService(UsuarioRepository usuarioRepository) {
      this.usuarioRepository = usuarioRepository;
   }

   public List<UsuarioDTO> buscarTodos() {
      return this.usuarioRepository.findAll().stream()
            .map(this::gerarDTO)
            .collect(Collectors.toList());
   }

   public UsuarioDTO gerarDTO(Usuario usuario) {
      return new UsuarioDTO(usuario.getId(),
            usuario.getUsername(), usuario.getSenha(),
            usuario.getAutoridades().stream()
               .map(EntidadeBase::getId)
               .collect(Collectors.toList()));
   }
}
