package com.ngspringrolebasedlogin.backend.controladores;

import com.ngspringrolebasedlogin.backend.dominio.Autoridade;
import com.ngspringrolebasedlogin.backend.servicos.AutoridadeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/autoridade")
@CrossOrigin(origins = "http://localhost:4200")
public class AutoridadeController {
   private final AutoridadeService autoridadeService;

   public AutoridadeController(AutoridadeService autoridadeService) {
      this.autoridadeService = autoridadeService;
   }

   @GetMapping(path = "todos")
   @ResponseBody
   public List<Autoridade> buscarTodos() {
      return this.autoridadeService.buscarTodos();
   }

}

