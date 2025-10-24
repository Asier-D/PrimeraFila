package com.registro.demo.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.registro.demo.model.Perro;

@Component("ejemploComponent")

public class EjemploComponent {

	public ArrayList <Perro> getPerros(){
		ArrayList<Perro> listaPerros = new ArrayList<Perro>();
		listaPerros.add(new Perro ("Maria", "nipa", "Pedro", "Dominguez", "Pedro@gmail.com"));
		listaPerros.add(new Perro ("Jorge", "luopa", "Javier", "Alvarez", "Javi@gmail.com"));
		listaPerros.add(new Perro ("Alberto", "menos", "Mike", "Castro", "Berr@gmail.com"));
		listaPerros.add(new Perro ("Juan", "sipa", "Juan", "Pascal", "juan@gmail.com"));
		return listaPerros;
	}
}
