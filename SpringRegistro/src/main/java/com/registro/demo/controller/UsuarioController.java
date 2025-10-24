package com.registro.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.registro.demo.model.Usuario;

@Controller
@RequestMapping("/ejemplos")

public class UsuarioController {

	final String plantillaUsuario = "plantillausuario";
	
	@GetMapping("/usuario")
	public String pasoObjeto(Model model) {
		Usuario u1 = new Usuario(plantillaUsuario, plantillaUsuario, plantillaUsuario, plantillaUsuario, false);
		
		u1.setNombre("Huevo");
		u1.setApellido("Fernandez");
		u1.setCorreo("huevo@gmail.com");
		u1.setContraseña("Huevo123");
		u1.isStatus();
		model.addAttribute("usuario", u1);
	
		return plantillaUsuario;
	}
}
