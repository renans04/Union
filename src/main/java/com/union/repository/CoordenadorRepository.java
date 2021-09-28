package com.union.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.union.coordenador.Coordenador;

@Repository // responsável por interagir com o db
public interface CoordenadorRepository extends JpaRepository<Coordenador, Integer>{
	// não entendi ainda o que é uma interface, mas acredito que seja onde duas ou mais classes possam ter o mesmo método
	
	// @Query("SELECT s FROM Student s WHERE s.email = ?1") copiei de um antigo código e não entendi
	Optional<Coordenador>findCoordenadorByNome(String nome);
	
	
	Coordenador findCoordenadorById(Integer id);
}
