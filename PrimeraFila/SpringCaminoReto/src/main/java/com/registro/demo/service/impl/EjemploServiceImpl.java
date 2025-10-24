package com.registro.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.registro.demo.model.Persona;

import org.springframework.stereotype.Service;

import com.registro.demo.service.EjemploService;

@Service("ejemploservicio")
public class EjemploServiceImpl implements EjemploService {
	
	@Override
	public List<Persona> getPersonas(){
		List<Persona> listapersonas = new ArrayList<Persona>();
		listapersonas.add(new Persona("Pedro", "Gonzalez", "743274327", 23));
		listapersonas.add(new Persona("Pedro", "Gonzalez", "743274327", 23));
		listapersonas.add(new Persona("Pedro", "Gonzalez", "743274327", 23));
		listapersonas.add(new Persona("Pedro", "Gonzalez", "743274327", 23));
		return listapersonas;
	}
	

}
