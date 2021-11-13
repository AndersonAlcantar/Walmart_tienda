package com.example.democrudmongo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.democrudmongo.model.Proveedores;

@Repository
public interface ProveedoresRepository extends MongoRepository<Proveedores, String>{
	
	Proveedores findByid(String id);
}