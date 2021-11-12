package com.example.democrudmongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.democrudmongo.model.Ventas;
import com.example.democrudmongo.repository.VentasRepository;

@Service
public class VentasService {

	@Autowired
	private VentasRepository ventasRepository;
	
	
	public Ventas registrarVenta(Ventas venta){
		return ventasRepository.save(venta);
	}
	
}
