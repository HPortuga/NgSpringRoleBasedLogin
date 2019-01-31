package com.ngspringrolebasedlogin.backend.servicos;

import com.ngspringrolebasedlogin.backend.dominio.Usuario;
import com.ngspringrolebasedlogin.backend.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
   private final UsuarioRepository usuarioRepository;

   @Autowired
   public UsuarioService(UsuarioRepository usuarioRepository) {
      this.usuarioRepository = usuarioRepository;
   }

   public List<Usuario> buscarTodos() {
      return this.usuarioRepository.findAll();
   }
}
