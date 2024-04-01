package com.factura.models;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase para definir el modelo del cliente.
 * 
 * @author felipe
 */
@Getter
@Setter
public class Cliente {
	
	/**
	 * Nombre del cliente.
	 */
	private String nombre;
	
	/**
	 * RFC del cliente
	 */
	private String rfc;

}
