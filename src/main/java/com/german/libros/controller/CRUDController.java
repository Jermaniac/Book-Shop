package com.german.libros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.german.libros.domain.Libro;
import com.german.libros.service.EscritorService;
import com.german.libros.service.LibrosService;

@Controller
public class CRUDController {
	
	@Autowired
	private EscritorService escritorService;
	@Autowired
	private LibrosService librosService;
	
	@RequestMapping("/libros/crear")
	public String mostrarFormAlta(Model model) {
		model.addAttribute("escritores",escritorService.devolverListado());
		model.addAttribute("libro", new Libro());
		return "formlibros";
	}
	
	@PostMapping("libros/guardar")
	public String guardar(Libro libro) {
		librosService.guardar(libro);
		return "redirect:/";
	}

}
