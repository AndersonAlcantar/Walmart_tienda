package com.example.democrudmongo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.democrudmongo.model.Usuarios;

@Repository
public interface UsuariosRepository extends MongoRepository<Usuarios, String>{
	
	Usuarios findByid(String id_usuario);
}