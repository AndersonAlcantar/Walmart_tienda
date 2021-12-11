package com.example.democrudmongo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.democrudmongo.model.Usuarios;
import com.example.democrudmongo.service.LoginService;




@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping(path = "/api/v1")
public class LoginController {
	
	@Autowired
	private LoginService loginservice;

	@PostMapping(path = "/login")
	public @ResponseBody String autenticarUsuario(@RequestBody Usuarios usuarioNuevo) {
	
		Usuarios usuarioAutenticado = loginservice.autenticarUsuarioServicio(usuarioNuevo.getNombresUsuario(), usuarioNuevo.getClaveUsuario());
		String respuesta = null;
		if(usuarioAutenticado != null) {
			respuesta = "EXITOSO";
		}else {
			respuesta = "CREDENCIALES INCORRECTAS";
		}
		
		return respuesta;
	}
	
	
}