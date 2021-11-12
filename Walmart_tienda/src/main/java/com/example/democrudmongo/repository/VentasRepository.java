package com.example.democrudmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.democrudmongo.model.Ventas;

public interface VentasRepository extends  MongoRepository<Ventas, String> {

}
