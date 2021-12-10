package com.example.democrudmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.democrudmongo.model.Clientes;
import com.example.democrudmongo.service.ClientesService;


@RestController
//crossOrigin= es el origen de los metodos
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping(path = "/api/v1")

public class ClientesController {
	
	@Autowired
	private ClientesService clienteService;
	
	@RequestMapping(value = "/guardarCliente", method = RequestMethod.POST)
	public @ResponseBody void guardarCliente(@RequestBody Clientes cliente) {
		clienteService.guardarCliente(cliente);
		
	}
	
	@RequestMapping(value = "/listarCliente", method = RequestMethod.GET)
	public @ResponseBody List<Clientes> listarCliente(){
		return clienteService.listarCliente();
	}
	
	@RequestMapping(value = "/mostrarCliente/{id}", method = RequestMethod.GET)
	public @ResponseBody Clientes mostrarCliente(@PathVariable("id") String id){
		return clienteService.mostrarCliente(id);
	}
	
	@RequestMapping(value = "eliminarCliente/{id}", method = RequestMethod.DELETE)
	public @ResponseBody void eliminarCliente(@PathVariable("id") String id){
		clienteService.eliminarCliente(id);
	}
	
	@RequestMapping(value = "/actualizarCliente", method = RequestMethod.PUT)
	public @ResponseBody void actualizarCliente(@RequestBody Clientes cliente) {
		clienteService.actualizarCliente(cliente);
	}
}