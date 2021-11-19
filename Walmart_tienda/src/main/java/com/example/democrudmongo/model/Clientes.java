package com.example.democrudmongo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "clientes")
public class Clientes {
	
	@Id
	private String id;						
	private String nombres_cliente;
	private String direccion_cliente;
	private String email_cliente;
	private String telefono_cliente;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombres_cliente() {
		return nombres_cliente;
	}
	public void setNombres_cliente(String nombres_cliente) {
		this.nombres_cliente = nombres_cliente;
	}
	public String getDireccion_cliente() {
		return direccion_cliente;
	}
	public void setDireccion_cliente(String direccion_cliente) {
		this.direccion_cliente = direccion_cliente;
	}
	public String getEmail_cliente() {
		return email_cliente;
	}
	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}
	public String getTelefono_cliente() {
		return telefono_cliente;
	}
	public void setTelefono_cliente(String telefono_cliente) {
		this.telefono_cliente = telefono_cliente;
	}
	
	public Clientes(String id, String nombres_cliente, String direccion_cliente, String email_cliente,
			String telefono_cliente) {
		super();
		this.id = id;
		this.nombres_cliente = nombres_cliente;
		this.direccion_cliente = direccion_cliente;
		this.email_cliente = email_cliente;
		this.telefono_cliente = telefono_cliente;
	}
	
	}