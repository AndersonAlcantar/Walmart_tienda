package com.example.democrudmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.democrudmongo.model.Productos;
import com.example.democrudmongo.repository.ProductosRepository;


@Service
public class ProductosService {
	@Autowired
	private ProductosRepository productosRepository;
	
	
	public void guardarProductos(Productos productos) {
		productosRepository.save(productos);
	}
	
	public List<Productos> listarProductos(){
		return productosRepository.findAll();
	}
	
	public Productos mostrarProductos(Long codigoProducto) {
		return productosRepository.findByCodigoProducto(codigoProducto);
	}
	
	public void eliminarProductos(Long codigoProducto) {
		productosRepository.deleteByCodigoProducto(codigoProducto);
	}
	
	public void actualizarProductos(Productos productos) {
		productosRepository.save(productos);
	}

}