package com.example.democrudmongo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.democrudmongo.model.Usuarios;
import com.example.democrudmongo.repository.UsuariosRepository;


@Service
public class UsuariosService {
	
	@Autowired
	private UsuariosRepository personaRepository;
	
	
	public void guardarPersona(Usuarios persona_usuario) {
		personaRepository.save(persona_usuario);
	}
	
	public List<Usuarios> listarPersonas(){
		return personaRepository.findAll();
	}
	
	public Usuarios mostrarPersona(String id) {
		return personaRepository.findById(id).orElse(null);
	}
	
	public void eliminarPersona(String id) {
		personaRepository.deleteById(id);
	}
	
	public void actualizarPersona(Usuarios persona_usuario) {
		personaRepository.save(persona_usuario);
	}
}