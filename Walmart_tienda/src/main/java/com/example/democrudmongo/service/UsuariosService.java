package com.example.democrudmongo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.democrudmongo.model.Usuarios;
import com.example.democrudmongo.repository.UsuariosRepository;


@Service
public class UsuariosService {
	
	@Autowired
	private UsuariosRepository UsuarioRepository;
	
	
	public void guardarUsuario(Usuarios usuario) {
		UsuarioRepository.save(usuario);
	}
	
	public List<Usuarios> listarUsuario(){
		return UsuarioRepository.findAll();
	}
	
	public Usuarios mostrarUsuario(String id) {
		return UsuarioRepository.findById(id).orElse(null);
	}
	
	public void eliminarUsuario(String id) {
		UsuarioRepository.deleteById(id);
	}
	
	public void actualizarUsuario(Usuarios usuario) {
		UsuarioRepository.save(usuario);
	}
}