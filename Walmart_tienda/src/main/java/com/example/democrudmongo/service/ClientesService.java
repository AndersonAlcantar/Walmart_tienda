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
	
	
	public void guardarCliente(Clientes cliente) {
		clientesRepository.save(cliente);
	}
	
	public List<Clientes> listarCliente(){
		return clientesRepository.findAll();
	}
	
	public Clientes mostrarCliente(String id) {
		return clientesRepository.findById(id).orElse(null);
	}
	
	public void eliminarCliente(String id) {
		clientesRepository.deleteById(id);
	}
	
	public void actualizarCliente(Clientes cliente) {
		clientesRepository.save(cliente);
	}
}