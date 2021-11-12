package com.example.democrudmongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.democrudmongo.model.Ventas;
import com.example.democrudmongo.service.VentasService;


@RestController
@RequestMapping(path = "/api/v1")
public class VentasController {
	
	@Autowired
	private VentasService ventasService;
	
	@RequestMapping(value = "/registrarVenta", method = RequestMethod.POST)
	public @ResponseBody String registrarVenta(@RequestBody Ventas venta) {
		if(ventasService.registrarVenta(venta) == null) {
			return "Error al registrar la venta";
		}else {
			return "Venta registrada con exito";
		}
	}
}
