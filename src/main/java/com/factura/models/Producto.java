package com.factura.models;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

/**
 * Clase para definir los atributos y metodos del producto.
 * 
 * @author felipe
 */
@Getter
@Setter
public class Producto {
	
	/**
	 * Codigo autogenerable, sin embargo, no presenta metodo setter.
	 */
	@Generated
	private int codigo;
	
	/**
	 * Nombre del producto.
	 */
	private String nombre;
	
	private static int ultimoId;
	
	/**
	 * Descripcion del producto.
	 */
	private Double precio;

	public Producto() {
		super();
		this.codigo = ++Producto.ultimoId;
	}
	
	

}
