package com.example.democrudmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.democrudmongo.model.Productos;


@Repository
public interface ProductosRepository extends MongoRepository <Productos, Long>{
	
	Productos findByCodigoProducto(Long codigoPorducto);
	void deleteByCodigoProducto(Long codigoPorducto);
}