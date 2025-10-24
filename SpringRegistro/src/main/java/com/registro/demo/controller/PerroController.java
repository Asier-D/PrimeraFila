package com.registro.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.registro.demo.model.Perro;

@Controller
@RequestMapping("/formulario")

public class PerroController {

	final String FormularioPerro = "formularioperro";
	final String ResultadoPerro = "resultadoperro";
	
	@GetMapping("/perro")
	public String mostrarForm(Model model) {
		model.addAttribute("perro", new Perro());
		return FormularioPerro;
	}
	
	@PostMapping("/aniadirperro")
	public ModelAndView aniadirPerro(@ModelAttribute("perro") Perro perro) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName(ResultadoPerro);
		mav.addObject("perro", perro);
		return mav;
	}
	
}
