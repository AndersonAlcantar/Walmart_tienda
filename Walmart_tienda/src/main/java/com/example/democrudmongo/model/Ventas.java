package com.example.democrudmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ventas")
public class Ventas {
	@Id
	private Long codigo;
	private String cedulaCliente;
	private String cedulaUsuario;
	private Double valorTotalVenta;
	private Double valorIva;
	private Double valorTotalMasIva;
	
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getCedulaCliente() {
		return cedulaCliente;
	}
	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}
	public String getCedulaUsuario() {
		return cedulaUsuario;
	}
	public void setCedulaUsuario(String cedulaUsuario) {
		this.cedulaUsuario = cedulaUsuario;
	}
	public Double getValorTotalVenta() {
		return valorTotalVenta;
	}
	public void setValorTotalVenta(Double valorTotalVenta) {
		this.valorTotalVenta = valorTotalVenta;
	}
	public Double getValorIva() {
		return valorIva;
	}
	public void setValorIva(Double valorIva) {
		this.valorIva = valorIva;
	}
	public Double getValorTotalMasIva() {
		return valorTotalMasIva;
	}
	public void setValorTotalMasIva(Double valorTotalMasIva) {
		this.valorTotalMasIva = valorTotalMasIva;
	}
	public Ventas(Long codigo, String cedulaCliente, String cedulaUsuario, Double valorTotalVenta, Double valorIva,
			Double valorTotalMasIva) {
		super();
		this.codigo = codigo;
		this.cedulaCliente = cedulaCliente;
		this.cedulaUsuario = cedulaUsuario;
		this.valorTotalVenta = valorTotalVenta;
		this.valorIva = valorIva;
		this.valorTotalMasIva = valorTotalMasIva;
	}
	
}

