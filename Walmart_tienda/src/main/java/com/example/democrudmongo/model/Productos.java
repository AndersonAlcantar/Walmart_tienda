package com.example.democrudmongo.model;


import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="productos")
public class Productos {

	
	private int id;
	private String nombre_producto;
	private int nit_proveedor;
	private double precio_compra;
	private double iva_compra;
	private double precio_venta;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Productos(int id, String nombre_producto, int nit_proveedor, double precio_compra, double iva_compra,
			double precio_venta) {
		super();
		this.id = id;
		this.nombre_producto = nombre_producto;
		this.nit_proveedor = nit_proveedor;
		this.precio_compra = precio_compra;
		this.iva_compra = iva_compra;
		this.precio_venta = precio_venta;
	}
	
	
	
	}