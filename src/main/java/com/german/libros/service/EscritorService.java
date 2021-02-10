package com.german.libros.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.german.libros.domain.Escritor;
import com.german.libros.repository.EscritorRepository;

@Service
public class EscritorService {

	private EscritorRepository escritorRepository;
	
	public EscritorService(EscritorRepository escritorRepository) {
		super();
		this.escritorRepository = escritorRepository;
	}

	public List<Escritor> devolverListado(){
		return escritorRepository.findAll();
	}
}
