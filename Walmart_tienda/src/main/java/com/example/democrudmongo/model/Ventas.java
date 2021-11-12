package com.example.democrudmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ventas")
public class Ventas {
	@Id
	private String codigo_venta;
	private String cedula_cliente;
	private String cedula_usuario;
	private Double valor_total_venta;
	private Double valor_iva;
	private Double valor_total_mas_iva;
	
	
	public String getCodigo_venta() {
		return codigo_venta;
	}
	public void setCodigo_venta(String codigo_venta) {
		this.codigo_venta = codigo_venta;
	}
	public String getCedula_cliente() {
		return cedula_cliente;
	}
	public void setCedula_cliente(String cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}
	public String getCedula_usuario() {
		return cedula_usuario;
	}
	public void setCedula_usuario(String cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	public Double getValor_total_venta() {
		return valor_total_venta;
	}
	public void setValor_total_venta(Double valor_total_venta) {
		this.valor_total_venta = valor_total_venta;
	}
	public Double getValor_iva() {
		return valor_iva;
	}
	public void setValor_iva(Double valor_iva) {
		this.valor_iva = valor_iva;
	}
	public Double getValor_total_mas_iva() {
		return valor_total_mas_iva;
	}
	public void setValor_total_mas_iva(Double valor_total_mas_iva) {
		this.valor_total_mas_iva = valor_total_mas_iva;
	}
	public Ventas(String codigo_venta, String cedula_cliente, String cedula_usuario, Double valor_total_venta,
			Double valor_iva, Double valor_total_mas_iva) {
		super();
		this.codigo_venta = codigo_venta;
		this.cedula_cliente = cedula_cliente;
		this.cedula_usuario = cedula_usuario;
		this.valor_total_venta = valor_total_venta;
		this.valor_iva = valor_iva;
		this.valor_total_mas_iva = valor_total_mas_iva;
	}
	
	
	
}

