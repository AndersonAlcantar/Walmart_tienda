package com.example.democrudmongo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.democrudmongo.model.Persona;
import com.example.democrudmongo.repository.PersonaRepository;


@Service
public class PersonaService {
	
	@Autowired
	private PersonaRepository personaRepository;
	
	
	public void guardarPersona(Persona persona) {
		personaRepository.save(persona);
	}
	
	public List<Persona> listarPersonas(){
		return personaRepository.findAll();
	}
	
	public Persona mostrarPersona(String id) {
		return personaRepository.findById(id).orElse(null);
	}
	
	public void eliminarPersona(String id) {
		personaRepository.deleteById(id);
	}
	
	public void actualizarPersona(Persona persona) {
		personaRepository.save(persona);
	}
}
