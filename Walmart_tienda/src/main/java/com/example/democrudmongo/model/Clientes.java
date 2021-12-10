package com.example.democrudmongo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "clientes")
public class Clientes {
	
	@Id
	private String id;						
	private String nombrescliente;
	private String direccion;
	private String email;
	private String telefono;
	
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombrescliente() {
		return nombrescliente;
	}
	public void setNombrescliente(String nombrescliente) {
		this.nombrescliente = nombrescliente;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public Clientes() {
		
	}
	public Clientes(String id, String nombrescliente, String direccion, String email, String telefono) {
		super();
		this.id = id;
		this.nombrescliente = nombrescliente;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;
	}
	
}