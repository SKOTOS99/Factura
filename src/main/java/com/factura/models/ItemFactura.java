package com.factura.models;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase modelo para el item de la factura.
 * 
 * @author felipe
 */
@Getter
@Setter
public class ItemFactura {
	
	/**
	 * Cantidad de productos.
	 */
	private int cantidad;
	
	/**
	 * Producto model
	 */
	private Producto producto;
	
	public Double calcularImporte() {
		return this.cantidad * this.producto.getPrecio();
	}

	public ItemFactura(int cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}
	
	
	
	

}
