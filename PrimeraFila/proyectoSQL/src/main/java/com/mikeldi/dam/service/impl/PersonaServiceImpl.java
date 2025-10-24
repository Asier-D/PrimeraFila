package com.mikeldi.dam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mikeldi.dam.model.Persona;
import com.mikeldi.dam.repository.PersonaJpaRepository;
import com.mikeldi.dam.service.PersonaService;

@Service("personaServiceImpl")
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	@Qualifier("personaJpaRepository")
	private PersonaJpaRepository personaJpaRepository;
	
	@Override
	public Persona aniadirPersona(Persona persona) {
		return personaJpaRepository.save(persona);
	}
	
}
