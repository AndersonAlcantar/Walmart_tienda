package com.example.democrudmongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.democrudmongo.model.Usuarios;
import com.example.democrudmongo.repository.LoginRepository;



@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepository;
	
	
	public Usuarios autenticarUsuarioServicio(String nombres, String clave) {
		Usuarios usuarioBuscado = loginRepository.findByNombresAndClave(nombres, clave);
		return usuarioBuscado;
	}
}