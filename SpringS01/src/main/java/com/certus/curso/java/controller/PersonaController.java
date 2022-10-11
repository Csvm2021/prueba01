package com.certus.curso.java.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.certus.curso.java.Models.Persona;

@Controller
@RequestMapping("/app")
public class PersonaController {
	
	//persona.controller.title
	@Value("${persona.controller.title}")
	private String valorListadoTitle;
	
	@GetMapping ({"/listar", "/personas"})
	public String listaPersonas(Model model) {
		
		Persona persona1 = new Persona();
		persona1.setNombre("Cesar");
		persona1.setApellidoPaterno("Vargas");
		persona1.setApellidoMaterno("Mendoza");
		persona1.setGenero('M');
		persona1.setEdad(20);
		
		Persona persona2 = new Persona();
		persona2.setNombre("Cesar2");
		persona2.setApellidoPaterno("Vargas2");
		persona2.setApellidoMaterno("Mendoza2");
		persona2.setGenero('M');
		persona2.setEdad(20);
		
		Persona persona3 = new Persona();
		persona3.setNombre("Cesar3");
		persona3.setApellidoPaterno("Vargas3");
		persona3.setApellidoMaterno("Mendoza3");
		persona3.setGenero('M');
		persona3.setEdad(20);
		
		System.out.print("VALOR EJEMPLO: "+persona3.getApellidoMaterno());
		
		Persona persona4 = new Persona();
		persona4.setNombre("Cesar4");
		persona4.setApellidoPaterno("Vargas4");
		persona4.setApellidoMaterno("Mendoza4");
		persona4.setGenero('M');
		persona4.setEdad(20);
		
		Persona persona5 = new Persona();
		persona5.setNombre("Cesar5");
		persona5.setApellidoPaterno("Vargas5");
		persona5.setApellidoMaterno("Mendoza5");
		persona5.setGenero('M');
		persona5.setEdad(20);
		
		List<Persona> listPersonas = Arrays.asList(persona1, persona2, persona3, persona4, persona5);
		
		//model.addAttribute("titulo", "Personas");
		model.addAttribute("titulo", valorListadoTitle);
		model.addAttribute("tituloListado", "Listado de Personas");
		model.addAttribute("user", listPersonas);
		
		return "persona";
	}
	
	@GetMapping ({"/listar/Param/{valorParam}/{valor2Param}", "/personas/Param/{valorParam}/{valor2Param}"})
	public String pathParam(@PathVariable String valorParam, @PathVariable String valor2Param, Model model) {
		
		model.addAttribute("titulo", "Parametros");
		model.addAttribute("tituloListado", "Recibiendo un parametro");
		model.addAttribute("claveParam", valorParam);
		model.addAttribute("clave2Param", valor2Param);
		
		System.out.print("Parametro recibido= "+valorParam);
		
		return "persona";
	}
	
}
