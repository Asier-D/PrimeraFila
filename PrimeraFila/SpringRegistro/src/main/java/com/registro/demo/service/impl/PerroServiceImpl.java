package com.registro.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.registro.demo.model.Perro;
import com.registro.demo.repository.PerroJpaRepository;
import com.registro.demo.service.PerroService;

@Service("perroServiceImpl")
public class PerroServiceImpl implements PerroService {

	@Autowired
	@Qualifier("perroJpaRepository")
	private PerroJpaRepository perroJpaRepository;
	
	@Override
	public Perro aniadirPerro(Perro perro) {
		return perroJpaRepository.save(perro);
	}
}