package com.registro.demo.controller;

import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.registro.demo.component.EjemploComponent;
import com.registro.demo.model.Perro;
import com.registro.demo.service.impl.PerroServiceImpl;

@Controller
@RequestMapping("/ejemplos")

public class FormularioPerroListadoController {

	final String FormularioListaPerro = "formulariolistaperro";
	private ArrayList<Perro> perros = new ArrayList<Perro>();
	private static final Log LOG = LogFactory.getLog(FormularioPerroListadoController.class);
	
	@Autowired 
	@Qualifier("ejemploComponent") 
	EjemploComponent ejemplo;
	
	@Autowired
	@Qualifier("perroServiceImpl")
	PerroServiceImpl servicePerro;
	
	@GetMapping("/mostrarformulario")
	public String mostrarForm(Model model) {
		model.addAttribute("perro", new Perro());
		perros = ejemplo.getPerros();
		model.addAttribute("perros", perros);
		return FormularioListaPerro;
	}
	
	@PostMapping("/aniadirperro")
	public ModelAndView aniadirPerro(@ModelAttribute("perro") Perro perro) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName(FormularioListaPerro);
		perros.add(perro);
		servicePerro.aniadirPerro(perro);
		LOG.info("Perro añadido con nombre " + perro.getNombre_perro() + " y raza "  + perro.getRaza());
		mav.addObject("perros", perros);
		mav.addObject("perro", new Perro());
		return mav;
	}
}
