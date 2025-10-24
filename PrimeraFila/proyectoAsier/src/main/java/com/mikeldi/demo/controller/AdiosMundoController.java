package com.mikeldi.demo.controller;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;

	@Controller
	@RequestMapping("/adios")

public class AdiosMundoController {

		@GetMapping("/adiosmundo")
		public String HolaMundo() {
			return "AdiosMundo";
		}
	
	
}
