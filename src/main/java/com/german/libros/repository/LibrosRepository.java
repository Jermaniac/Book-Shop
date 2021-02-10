package com.german.libros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.german.libros.domain.Libro;

public interface LibrosRepository extends JpaRepository<Libro, Integer>{
	
	@Query("FROM Libro l WHERE l.nombre LIKE %?1%")
	List<Libro> buscar(String consulta);
	
	@Query("FROM Libro l WHERE l.escritor.id=?1 ORDER BY l.nombre")
	List<Libro> devolverLibrosPorEscritor(Integer id);
	


}
