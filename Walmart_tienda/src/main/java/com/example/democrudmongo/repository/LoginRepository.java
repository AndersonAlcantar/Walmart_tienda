package com.example.democrudmongo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.democrudmongo.model.Usuarios;




@Repository
public interface LoginRepository extends MongoRepository<Usuarios, String>{
	
	Usuarios findByNombresAndClave(String nombres, String clave);
	Usuarios findByClave(String clave);
}