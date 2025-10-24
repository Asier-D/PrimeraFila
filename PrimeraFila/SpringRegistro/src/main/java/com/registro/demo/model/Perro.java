package com.registro.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="perro")
public class Perro {

	@Id
	private int id;
	@Column
	private String nombre_perro;
	@Column
	private String raza;
	@Column
	private String nombre_duenio;
	@Column
	private String apellido;
	@Column
	private String correo;
	
	public Perro() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre_perro() {
		return nombre_perro;
	}
	public void setNombre_perro(String nombre_perro) {
		this.nombre_perro = nombre_perro;
	}
	public String getNombre_duenio() {
		return nombre_duenio;
	}
	public void setNombre_duenio(String nombre_duenio) {
		this.nombre_duenio = nombre_duenio;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public Perro(String nombre_perro, String raza, String nombre_duenio, String apellido, String correo) {
		super();
		this.nombre_perro = nombre_perro;
		this.raza = raza;
		this.nombre_duenio = nombre_duenio;
		this.apellido = apellido;
		this.correo = correo;
	}
	
}
