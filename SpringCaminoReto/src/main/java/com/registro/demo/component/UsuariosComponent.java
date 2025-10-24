package com.registro.demo.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.registro.demo.model.Rol;
import com.registro.demo.model.RolModulo;
import com.registro.demo.model.Usuario;

@Component("UsuariosComponent")
public class UsuariosComponent {
	
	@Autowired
	@Qualifier("ListaRoles")
	RolesComponent roles;

	public ArrayList <Usuario> getUsuarios(){
		ArrayList<Usuario> listaPersonas = new ArrayList<Usuario>();
		ArrayList<Rol> listaRoles = roles.getRoles();
		listaPersonas.add(new Usuario ("Javi", "Dominguez", "812381238"));
		RolModulo rolJavier = new RolModulo(listaRoles.get(0), "Admin");
		RolModulo rolJavier2 = new RolModulo(listaRoles.get(0), "Directivo");
		listaPersonas.add(new Usuario ("Rubén", "García", "8998234"));
		RolModulo RolRuben = new RolModulo(listaRoles.get(1), "Directivo");
		listaPersonas.add(new Usuario ("Nacho", "Castro", "94382434"));
		RolModulo RolNacho = new RolModulo(listaRoles.get(2), "Directivo");
		RolModulo RolNacho2 = new RolModulo(listaRoles.get(2), "Usuario");
		listaPersonas.add(new Usuario ("Pedro", "Herrero", "43214433"));
		RolModulo RolPedro = new RolModulo(listaRoles.get(3), "Usuario");
		return listaPersonas;
	}
	
	
}
