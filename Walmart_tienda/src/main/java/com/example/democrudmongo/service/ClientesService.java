package com.example.democrudmongo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.democrudmongo.model.Clientes;
import com.example.democrudmongo.repository.ClientesRepository;


@Service
public class ClientesService {
	
	@Autowired
	private ClientesRepository clientesRepository;
	
	
	public void guardarPersona(Clientes persona_cliente) {
		clientesRepository.save(persona_cliente);
	}
	
	public List<Clientes> listarPersonas(){
		return clientesRepository.findAll();
	}
	
	public Clientes mostrarPersona(String id) {
		return clientesRepository.findById(id).orElse(null);
	}
	
	public void eliminarPersona(String id) {
		clientesRepository.deleteById(id);
	}
	
	public void actualizarPersona(Clientes persona_cliente) {
		clientesRepository.save(persona_cliente);
	}
}