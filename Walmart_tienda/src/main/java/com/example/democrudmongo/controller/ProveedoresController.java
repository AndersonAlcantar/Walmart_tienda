package com.example.democrudmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.democrudmongo.model.Proveedores;
import com.example.democrudmongo.service.ProveedoresService;


@RestController
@RequestMapping(path = "/api/v1")
public class ProveedoresController {
	
	@Autowired
	private ProveedoresService proveedorService;
	
	@RequestMapping(value = "/guardarProveedor", method = RequestMethod.POST)
	public @ResponseBody void guardarProveedor(@RequestBody Proveedores proveedor) {
		proveedorService.guardarProveedores(proveedor);
		
	}
	
	@RequestMapping(value = "/listarProveedores", method = RequestMethod.POST)
	public @ResponseBody List<Proveedores> listarProveedores(){
		return proveedorService.listarProveedores();
	}
	
	@RequestMapping(value = "/mostrarProveedor/{id}", method = RequestMethod.POST)
	public @ResponseBody Proveedores mostrarProveedor(@PathVariable("id") String id){
		return proveedorService.mostrarProveedores(id);
	}
	
	@RequestMapping(value = "eliminarProveedor/{id}", method = RequestMethod.DELETE)
	public @ResponseBody void eliminarProveedor(@PathVariable("id") String id){
		proveedorService.eliminarProveedores(id);
	}
	
	@RequestMapping(value = "/actualizarProveedor", method = RequestMethod.PUT)
	public @ResponseBody void actualizarProveedor(@RequestBody Proveedores proveedor) {
		proveedorService.actualizarProveedores(proveedor);
	}
}