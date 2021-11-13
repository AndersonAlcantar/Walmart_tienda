package com.example.democrudmongo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.democrudmongo.model.Clientes;

@Repository
public interface ClientesRepository extends MongoRepository<Clientes, String>{
	
	Clientes findByid(String id_clientes);
}