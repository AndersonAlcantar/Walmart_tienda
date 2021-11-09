package com.example.democrudmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.democrudmongo.model.Persona;
import com.example.democrudmongo.service.PersonaService;


@RestController
@RequestMapping(path = "/api/v1")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@RequestMapping(value = "/guardarPersona", method = RequestMethod.POST)
	public @ResponseBody void guardarPersona(@RequestBody Persona persona) {
		personaService.guardarPersona(persona);
	}
	
	@RequestMapping(value = "/listarPersonas", method = RequestMethod.POST)
	public @ResponseBody List<Persona> listarPersonas(){
		return personaService.listarPersonas();
	}
	
	@RequestMapping(value = "/mostrarPersona/{id}", method = RequestMethod.POST)
	public @ResponseBody Persona mostrarPersona(@PathVariable("id") String id){
		return personaService.mostrarPersona(id);
	}
	
	@RequestMapping(value = "eliminarPersona/{id}", method = RequestMethod.DELETE)
	public @ResponseBody void eliminarPersona(@PathVariable("id") String id){
		personaService.eliminarPersona(id);
	}
	
	@RequestMapping(value = "/actualizarPersona", method = RequestMethod.PUT)
	public @ResponseBody void actualizarPersona(@RequestBody Persona persona) {
		personaService.actualizarPersona(persona);
	}
}
