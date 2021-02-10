package com.german.libros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.german.libros.domain.Libro;
import com.german.libros.service.LibrosService;

@Controller
public class ListadoController {
	
	@Autowired
	public LibrosService service;
	
	@RequestMapping("/")
	public String devolverListado(Model model) {
		List<Libro> librosCompletos = service.devolverLista();
		model.addAttribute("libros", librosCompletos);
		return "listado";
	}
	@RequestMapping("/buscar")
	public String devolverLibrosBuscados(@RequestParam("q") String consulta, Model model) {
		List<Libro> librosBuscados = service.devolverLibrosBuscados(consulta);
		model.addAttribute("libros", librosBuscados);
		if (librosBuscados.isEmpty()) {
			return "nodata";
		}
		return "listado";
	}
	
	@RequestMapping("/librosporescritor")
	public String devolverLibrosPorEscritor (Integer id, Model model) {
		List<Libro> librosPorEscritor = service.devolverLibrosPorEscritor(id);
		model.addAttribute("libros", librosPorEscritor);
		return "listado";
	}

}
