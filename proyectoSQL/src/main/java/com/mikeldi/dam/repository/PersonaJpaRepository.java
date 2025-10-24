package com.mikeldi.dam.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mikeldi.dam.model.Persona;

public interface PersonaJpaRepository extends JpaRepository<Persona, Serializable> {

	
	
}
