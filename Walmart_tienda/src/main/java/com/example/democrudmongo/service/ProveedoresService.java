package com.example.democrudmongo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.democrudmongo.model.Proveedores;
import com.example.democrudmongo.repository.ProveedoresRepository;


@Service
public class ProveedoresService {
	
	@Autowired
	private ProveedoresRepository proveedorRepository;
	
	
	public void guardarProveedores(Proveedores proveedor) {
		proveedorRepository.save(proveedor);
	}
	
	public List<Proveedores> listarProveedores(){
		return proveedorRepository.findAll();
	}
	
	public Proveedores mostrarProveedores(String id) {
		return proveedorRepository.findById(id).orElse(null);
	}
	
	public void eliminarProveedores(String id) {
		proveedorRepository.deleteById(id);
	}
	
	public void actualizarProveedores(Proveedores proveedor) {
		proveedorRepository.save(proveedor);
	}
}