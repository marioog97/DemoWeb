package com.nttdata.demoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
 	@GetMapping("/saludo")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="Mundo") 
							String name, Model model) {
		model.addAttribute("name", name);
		return "hola";
	}
 	
 	@GetMapping ("/error")
 	public String errorPage() {
 		return "error";
 	}
}
