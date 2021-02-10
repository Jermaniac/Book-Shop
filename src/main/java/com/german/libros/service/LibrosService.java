package com.german.libros.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.german.libros.domain.Libro;
import com.german.libros.repository.LibrosRepository;

@Service
public class LibrosService {
	
	@Autowired
	public LibrosRepository librosRepository;
	
	public List<Libro> devolverLista(){
		return librosRepository.findAll();
	}
	
	public Libro guardar(Libro libro) {
		return librosRepository.save(libro);
	}
	
	public List<Libro> devolverLibrosBuscados(String consulta){
		return librosRepository.buscar(consulta);
	}
	
	public List<Libro> devolverLibrosPorEscritor(Integer id){
		return librosRepository.devolverLibrosPorEscritor(id);
	}

}
