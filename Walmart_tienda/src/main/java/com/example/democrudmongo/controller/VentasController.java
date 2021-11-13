package com.example.democrudmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.democrudmongo.model.DetalleVentas;
import com.example.democrudmongo.model.Ventas;
import com.example.democrudmongo.service.VentasService;


@RestController
@RequestMapping(path = "/api/v1")
public class VentasController {
	
	@Autowired
	private VentasService ventasService;
	
	@RequestMapping(value = "/registrarVenta", method = RequestMethod.POST)
	public @ResponseBody String registrarVenta(@RequestBody Ventas venta) {
		return ventasService.registrarVenta(venta);
	}
	
	@RequestMapping(value = "/buscarVenta", method = RequestMethod.POST)
	public @ResponseBody Ventas buscarVenta(@RequestBody Ventas venta){
		return ventasService.buscarVenta(venta);
	}
	
//	@RequestMapping(value = "/mostrarVenta", method = RequestMethod.POST)
//	public @ResponseBody List<Ventas> mostrarVentas(@RequestBody Ventas venta){
//		return ventasService.mostrarRegistrar(venta.getCodigo());
//	}
	
	@RequestMapping(value = "/registrarDetalleVenta", method = RequestMethod.POST)
	public @ResponseBody void registrarDetalleVenta(@RequestBody DetalleVentas detalleVentas) {
		ventasService.registrarDetalleVenta(detalleVentas);
	}
	
}
