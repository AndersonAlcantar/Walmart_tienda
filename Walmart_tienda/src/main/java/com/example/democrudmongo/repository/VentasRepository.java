package com.example.democrudmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.democrudmongo.model.Ventas;

public interface VentasRepository extends  MongoRepository<Ventas, Long> {
	
	Ventas findByCodigo(Long codigo); 
	//Ventas findTop1ByCodigoCreatedDesc();
	
	//@Query("{codigo:{$lt: ?0}}")
	@Query("{codigo: ?0}")  
	List<Ventas> getVentasByCodigo(Long codigo);
}
