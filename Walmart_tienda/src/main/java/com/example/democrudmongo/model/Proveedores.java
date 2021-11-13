package com.example.democrudmongo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "proveedores")
public class Proveedores {
	
	@Id
	private String id;						
	private String nombredelproveedor;
	private String direccion;
	private String ciudad;
	private Integer telefono;
	private String email;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombredelproveedor() {
		return nombredelproveedor;
	}
	public void setNombredelproveedor(String nombredelproveedor) {
		this.nombredelproveedor = nombredelproveedor;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String Direccion) {
		this.direccion = Direccion;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String Ciudad) {
		this.ciudad = Ciudad;
	}
	
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	public Proveedores() {
		
	}
	
	public Proveedores(String id, String nombres, String direccion, String ciudad,Integer telefono, String email ) {
		super();
		this.id= id;
		this.nombredelproveedor = nombres;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.telefono = telefono;
		this.email = email;
	}
	
	
}