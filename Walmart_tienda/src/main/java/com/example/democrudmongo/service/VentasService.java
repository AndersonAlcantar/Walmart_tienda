package com.example.democrudmongo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.democrudmongo.model.DetalleVentas;
import com.example.democrudmongo.model.Ventas;
import com.example.democrudmongo.repository.DetalleVentasRepository;
import com.example.democrudmongo.repository.VentasRepository;

@Service
public class VentasService {

	@Autowired
	private VentasRepository ventasRepository;
	
	
	
	@Autowired
	private DetalleVentasRepository detalleVentasRepository;
	
	public Ventas buscarVenta(Ventas venta){
		return ventasRepository.findById(venta.getCodigo()).orElse(null);
	}
	
	public String registrarVenta(Ventas venta){
		Ventas ventas = buscarVenta(venta);
		Long codigo;
		String respuesta; 
		if(ventas != null) {
			ventasRepository.save(ventas);
			respuesta = "Venta numero " + ventas.getCodigo() + " actualizada";
		}else {
			ventasRepository.save(venta);
			respuesta = "Venta numero " + venta.getCodigo() + " registrada con exito";
		}
		return respuesta;
	}
	
	public void registrarDetalleVenta(DetalleVentas detalleVentas){
		detalleVentasRepository.save(detalleVentas);
	}
	
	
//	public List<Ventas> mostrarRegistrar(Long codigo){
//		return ventasRepository.getVentasByCodigo(codigo);
//	}
	
}
