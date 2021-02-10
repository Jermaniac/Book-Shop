package com.german.libros.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.german.libros.domain.Escritor;

public interface EscritorRepository extends JpaRepository<Escritor, Integer> {
	

}
