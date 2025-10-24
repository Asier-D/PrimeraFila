package com.registro.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.registro.demo.component.UsuariosComponent;
import com.registro.demo.model.Usuario;
import com.registro.demo.model.Persona;
import com.registro.demo.service.impl.EjemploServiceImpl;

@Controller
@RequestMapping("/usuarios")
public class UsuariosListaController {

	final String ListaUsuarios = "listausuarios";
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
//	private static final Log LOG = LogFactory.getLog(UsuariosListaController.class);
	
	@Autowired 
	@Qualifier("UsuariosComponent") 
	UsuariosComponent ejemplo;
	
	@Autowired
	@Qualifier("ejemploservicio")
	EjemploServiceImpl ejemploServicio;
	
	@GetMapping("/ejemplo")
	public String enviarListado(Model model) {
		model.addAttribute("personas", ejemploServicio.getPersonas());
		return ListaUsuarios;
	}
	
	@RequestMapping(value = "/ejemplo3mav", method = RequestMethod.GET)
	public ModelAndView enviarListadoMAV() {
		ModelAndView mav = new ModelAndView(ListaUsuarios);
		mav.addObject("personas", ejemploServicio.getPersonas());
		return mav;
	
	}

	@GetMapping("/lista")
	public String mostrarForm(Model model) {
		model.addAttribute("usuario", new Usuario());
		usuarios = ejemplo.getUsuarios();
		model.addAttribute("usuarios", usuarios);
		return ListaUsuarios;
	}
	
}
