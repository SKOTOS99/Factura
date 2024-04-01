package com.factura.models;

import java.util.Arrays;
import java.util.Date;

import com.factura.constants.GlobalConstants;
import com.factura.utils.Utils;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

/**
 * Clase para definir el modelo de factura.
 * 
 * @author felipe
 */
@Getter
@Setter
public class Factura {

	/**
	 * folio de la factura.
	 */
	@Generated
	private int folio;

	/**
	 * descripcion de la factura.
	 */
	private String descipcion;

	/**
	 * fecha de creacion.
	 */
	private Date fecha;

	/**
	 * Cliente modelo.
	 */
	private Cliente cliente;

	/**
	 * Arreglo de items.
	 */
	private ItemFactura[] items;

	/**
	 * Posicion de item.
	 */
	private int indiceItems;

	/**
	 * Metodo para incrementar el indice de cada item.
	 * 
	 * @param item as ItemFactura object.
	 */
	public void addItemFactura(ItemFactura item) {
		if (indiceItems < GlobalConstants.MAX_ITEMS) {
			this.items[indiceItems++] = item;
		}

	}

	public Double calcularTotal() {
		Double total = 0.0;

		for (ItemFactura factura : this.items) {
			total += factura != null ? factura.calcularImporte() : 0;
		}
		return total;
	}

	public String detalle() {
		StringBuilder sb = new StringBuilder();
		sb.append("Factura No. ").append(this.folio).append("\ncliente: ").append(this.cliente.getNombre())
				.append("\rfc: ").append(this.cliente.getRfc()).append("\nfecha: ")
				.append(Utils.formateaFecha(this.fecha)).append("\nproductos: ")
				.append("\n#\tNombre\t$\tcant.\tTotal\n").append(Arrays.toString(this.items));
		for (ItemFactura factura : this.items) {
			sb.append("\t").append("\n producto").append(factura.getProducto().getNombre()).append("\t")
					.append(factura.getProducto().getPrecio()).append("\t").append(factura.getCantidad()).append("\t")
					.append(factura.calcularImporte()).append("\n");
		}
		sb.append("\nTotal").append(calcularTotal());
		

		return sb.toString();
	}

	public Factura(String descipcion, Cliente cliente) {
		this.descipcion = descipcion;
		this.cliente = cliente;
		this.items = new ItemFactura[GlobalConstants.MAX_ITEMS];
		this.fecha = new Date();
	}

}
