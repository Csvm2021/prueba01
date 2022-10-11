package com.certus.curso.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class HomeController {
	
	//@RequestMapping(value = "/index", method = RequestMethod.GET)
	@GetMapping({"/inicio","/home","/","Home","Inicio"})
	/*public ModelAndView inicio(ModelAndView mv) {
		mv.addObject("titulo", "Curso Spring Certus 2022");
		mv.setViewName("index");
		return mv;
	}*/
		
	public String inicio(Model model) {
		model.addAttribute("titulo", "Curso Spring Certus");
		model.addAttribute("mensaje", "Hola Spring");
		return "index";
	}
	
}
