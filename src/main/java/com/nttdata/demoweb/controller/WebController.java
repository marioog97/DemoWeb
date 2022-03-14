package com.nttdata.demoweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nttdata.demoweb.repo.entity.Usuario;
import com.nttdata.demoweb.service.EmpleadoService;

@Controller
public class WebController {
	@Autowired
	EmpleadoService empleadoService;
	 
	 @GetMapping("/")
		public String index (Model model) {
			Usuario u = (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			model.addAttribute("usuario", u);
			return "index";
		}
	
	
 	@GetMapping("/saludo")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="Mundo") 
							String name, Model model) {
		model.addAttribute("name", name);
		empleadoService.registrar(name);
		return "hola";
	}
 	
 	@PreAuthorize("hasRole('ROLE_ADMIN')")
 	@GetMapping("/listarEmpleados")
 	public String listarEmp(Model model) {
 		model.addAttribute("listaEmp", empleadoService.listar());
 		model.addAttribute("listaEmpConE", empleadoService.listarFiltroNombre("e"));
 		model.addAttribute("listaJPA", empleadoService.listarConJPA(2, "%o%"));
 		model.addAttribute("listaEmpNombreExacto", empleadoService.filtrarCuyoNombreEs("Rocío"));
 		return "listarDeEmpleados";
 	}
 	
 	@GetMapping ("/error")
 	public String errorPage() {
 		return "error";
 	}
}
