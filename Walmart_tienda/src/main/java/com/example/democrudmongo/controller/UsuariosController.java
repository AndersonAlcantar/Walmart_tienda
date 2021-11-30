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

import com.example.democrudmongo.model.Usuarios;
import com.example.democrudmongo.service.UsuariosService;


@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping(path = "/api/v1")
public class UsuariosController {
	
	@Autowired
	private UsuariosService personaService;
	
	@RequestMapping(value = "/guardarUsuario", method = RequestMethod.POST)
	public @ResponseBody void guardarPersona(@RequestBody Usuarios usuario) {
		personaService.guardarUsuario(usuario);
	}
	
	@RequestMapping(value = "/listarUsuario", method = RequestMethod.GET)
	public @ResponseBody List<Usuarios> listarUsuario(){
		return personaService.listarUsuario();
	}
	
	@RequestMapping(value = "/mostrarUsuario/{id}", method = RequestMethod.GET)
	public @ResponseBody Usuarios mostrarPersona(@PathVariable("id") String id){
		return personaService.mostrarUsuario(id);
	}
	
	@RequestMapping(value = "eliminarUsuario/{id}", method = RequestMethod.DELETE)
	public @ResponseBody void eliminarPersona(@PathVariable("id") String id){
		personaService.eliminarUsuario(id);
	}
	
	@RequestMapping(value = "/actualizarUsuario", method = RequestMethod.PUT)
	public @ResponseBody void Usuario(@RequestBody Usuarios usuario) {
		personaService.actualizarUsuario(usuario);
	}
}