package com.example.democrudmongo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="productos")
public class Productos {

	@Id
	private Long codigoProducto;
	private String nombre_producto;
	private int nit_proveedor;
	private double precio_compra;
	private double iva_compra;
	private double precio_venta;
	
	
	public Long getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(Long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public int getNit_proveedor() {
		return nit_proveedor;
	}
	public void setNit_proveedor(int nit_proveedor) {
		this.nit_proveedor = nit_proveedor;
	}
	public double getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}
	public double getIva_compra() {
		return iva_compra;
	}
	public void setIva_compra(double iva_compra) {
		this.iva_compra = iva_compra;
	}
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	public Productos(Long codigoProducto, String nombre_producto, int nit_proveedor, double precio_compra,
			double iva_compra, double precio_venta) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombre_producto = nombre_producto;
		this.nit_proveedor = nit_proveedor;
		this.precio_compra = precio_compra;
		this.iva_compra = iva_compra;
		this.precio_venta = precio_venta;
	}

	
	
	
	
	}