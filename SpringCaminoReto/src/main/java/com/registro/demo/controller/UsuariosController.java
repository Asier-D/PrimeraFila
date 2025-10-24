package com.registro.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/perfil")
public class UsuariosController {
	
	final String PerfilUsuario = "perfilusuario";
	
	@GetMapping("/nombre")
	public String Perfil() {
		return PerfilUsuario;
	}
	
}
