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
@RequestMapping(path = "/api/v1")
//crossOrigin= es el origen de los metodos
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
public class ClientesController {
	
	@Autowired
	private ClientesService personaService;
	
	@RequestMapping(value = "/guardarCliente", method = RequestMethod.POST)
	public @ResponseBody void guardarPersona(@RequestBody Clientes persona_cliente) {
		personaService.guardarPersona(persona_cliente);
		
	}
	
	@RequestMapping(value = "/listarCliente", method = RequestMethod.POST)
	public @ResponseBody List<Clientes> listarPersonas(){
		return personaService.listarPersonas();
	}
	
	@RequestMapping(value = "/mostrarCliente/{id}", method = RequestMethod.POST)
	public @ResponseBody Clientes mostrarPersona(@PathVariable("id") String id){
		return personaService.mostrarPersona(id);
	}
	
	@RequestMapping(value = "eliminarCliente/{id}", method = RequestMethod.DELETE)
	public @ResponseBody void eliminarPersona(@PathVariable("id") String id){
		personaService.eliminarPersona(id);
	}
	
	@RequestMapping(value = "/actualizarCliente", method = RequestMethod.PUT)
	public @ResponseBody void Usuario(@RequestBody Clientes persona_cliente) {
		personaService.actualizarPersona(persona_cliente);
	}
}