package com.registro.demo.model;

public class Usuario {
	
	private String nombre;
	private String apellido;
	private String correo;
	private String contraseña;
	private boolean status;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Usuario(String nombre, String apellido, String correo, String contraseña, boolean status) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contraseña = contraseña;
		this.status = status;
	}
	
	
}
