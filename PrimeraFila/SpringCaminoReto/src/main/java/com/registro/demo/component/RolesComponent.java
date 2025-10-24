package com.registro.demo.component;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.registro.demo.model.Rol;

@Component("RolesCompoenent")
public class RolesComponent {
	
	public ArrayList <Rol> getRoles(){
		ArrayList<Rol> Roles = new ArrayList<Rol>();
		Roles.add(new Rol (1, "Admin", "Descripción admin"));
		Roles.add(new Rol (2, "Usuario", "Descripción usuario"));
		Roles.add(new Rol (3, "Directivo", "Descripción Directivo"));
		
		return Roles;
	}
	
}
