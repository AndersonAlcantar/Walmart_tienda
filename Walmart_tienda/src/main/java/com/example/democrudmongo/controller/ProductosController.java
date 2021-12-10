package com.example.democrudmongo.controller;


	
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.democrudmongo.model.Productos;
import com.example.democrudmongo.service.ProductosService;

	

@RestController
@RequestMapping(path = "/api/v1")
public class ProductosController {

	@Autowired
	private ProductosService productosService;
	
	@RequestMapping(value = "/guardarProductos", method = RequestMethod.POST)
	public @ResponseBody void guardarProductos(@RequestBody Productos productos) {
		productosService.guardarProductos(productos);
	}
	
	@RequestMapping(value = "/listarProductos", method = RequestMethod.GET)
	public @ResponseBody List<Productos> listarProductos(){
		return productosService.listarProductos();
	}
	
	@RequestMapping(value = "/mostrarProductos/{id}", method = RequestMethod.GET)
	public @ResponseBody Productos mostrarProductos(@PathVariable("codigoProducto") Long codigoProducto){
		return productosService.mostrarProductos(codigoProducto);
	}
	
	@RequestMapping(value = "eliminarProductos/{id}", method = RequestMethod.DELETE)
	public @ResponseBody void eliminarProductos(@PathVariable("codigoProducto") Long codigoProducto){
		productosService.eliminarProductos(codigoProducto);
	}
	
	@RequestMapping(value = "/actualizarProductos", method = RequestMethod.PUT)
	public @ResponseBody void actualizarProductos(@RequestBody Productos productos) {
		productosService.actualizarProductos(productos);
	}
	
}