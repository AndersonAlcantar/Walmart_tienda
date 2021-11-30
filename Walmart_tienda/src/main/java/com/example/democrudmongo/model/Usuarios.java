package com.example.democrudmongo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "usuarios")
public class Usuarios {
	
	@Id
	private String idUsuario;						
	private String nombresUsuario;
	private String apellidosUsuario;
	private String emailUsuario;
	private String cargoUsuario;
	private String claveUsuario;
	
	
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombresUsuario() {
		return nombresUsuario;
	}
	public void setNombresUsuario(String nombresUsuario) {
		this.nombresUsuario = nombresUsuario;
	}
	public String getApellidosUsuario() {
		return apellidosUsuario;
	}
	public void setApellidosUsuario(String apellidosUsuario) {
		this.apellidosUsuario = apellidosUsuario;
	}
	public String getEmailUsuario() {
		return emailUsuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	public String getCargoUsuario() {
		return cargoUsuario;
	}
	public void setCargoUsuario(String cargoUsuario) {
		this.cargoUsuario = cargoUsuario;
	}
	public String getClaveUsuario() {
		return claveUsuario;
	}
	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}
	
	
	public Usuarios(String idUsuario, String nombresUsuario, String apellidosUsuario, String emailUsuario,
			String cargoUsuario, String claveUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.nombresUsuario = nombresUsuario;
		this.apellidosUsuario = apellidosUsuario;
		this.emailUsuario = emailUsuario;
		this.cargoUsuario = cargoUsuario;
		this.claveUsuario = claveUsuario;
	}
		
}