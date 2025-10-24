package com.registro.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.registro.demo.model.Persona;

@Controller
@RequestMapping("/ejemplos")

public class EjemploPasoListadoController {

	final String plantillaPasoListado = "plantillapasolistado";
	
	@GetMapping("/ejemplo3")
	public String mostrarForm(Model model) {
		model.addAttribute("personas", getPersonas());
		return plantillaPasoListado;
	}
	
	@RequestMapping(value = "/ejemplo3mav", method = RequestMethod.GET)
	public ModelAndView enviarListadoMAV() {
		ModelAndView mav = new ModelAndView(plantillaPasoListado);
		mav.addObject("personas", getPersonas());
		return mav;
		}
	
	private List <Persona> getPersonas(){
		List<Persona> listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(new Persona ("Maria", "Perez", "435353", 12));
		listaPersonas.add(new Persona ("Jorge", "García", "8324321", 32));
		listaPersonas.add(new Persona ("Alberto", "Dominguez", "5466321", 42));
		listaPersonas.add(new Persona ("Juan", "Perez", "3981234", 54));
		return listaPersonas;
	}
	
	
}
