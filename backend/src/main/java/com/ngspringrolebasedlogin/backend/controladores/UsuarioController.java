package com.ngspringrolebasedlogin.backend.controladores;

import com.ngspringrolebasedlogin.backend.dominio.Usuario;
import com.ngspringrolebasedlogin.backend.pojos.UsuarioDTO;
import com.ngspringrolebasedlogin.backend.servicos.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {
   private final UsuarioService usuarioService;

   @Autowired
   public UsuarioController(UsuarioService usuarioService) {
      this.usuarioService = usuarioService;
   }

   @GetMapping(path = "/todos")
   @ResponseBody
   public List<UsuarioDTO> buscarTodos() {
      return this.usuarioService.buscarTodos();
   }
}
