package com.certus.id.InyeccionDependecia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.certus.id.InyeccionDependecia.service.IClienteService;

@Controller
public class HomeController {
	
	@Autowired
	private IClienteService IClientito;
	@GetMapping("/inicio")
	public String home(Model model) {
		
		model.addAttribute("mensaje", "creando projecto");
		model.addAttribute("cliente", IClientito.nuevoCliente());
		return "home";
	}

}
