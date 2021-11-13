package com.example.democrudmongo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "detalle_ventas")
public class DetalleVentas {
		
	private Long codigoVenta;
	private Long codigoProducto;
	private Double cantidad;
	private Double valorUnitario;
	private Double valorTotal;
	
	
	
	public Long getCodigoVenta() {
		return codigoVenta;
	}
	public void setCodigoVenta(Long codigoVenta) {
		this.codigoVenta = codigoVenta;
	}
	public Long getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(Long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	public Double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public DetalleVentas(Long codigoVenta, Long codigoProducto, Double cantidad, Double valorUnitario,
			Double valorTotal) {
		super();
		this.codigoVenta = codigoVenta;
		this.codigoProducto = codigoProducto;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
		this.valorTotal = valorTotal;
	}

	
	
	
}
