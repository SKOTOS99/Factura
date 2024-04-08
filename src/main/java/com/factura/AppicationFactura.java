package com.factura;

import java.util.Scanner;

import com.factura.models.Cliente;
import com.factura.models.Factura;
import com.factura.models.ItemFactura;
import com.factura.models.Producto;

public class AppicationFactura {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setRfc("MECF45746");
		cliente.setNombre("Jesus");
		Scanner s  = new Scanner(System.in);
		
		System.out.println("Ingrese la descripcion de la factura...");
		String desc = s.nextLine();
		Factura factura = new Factura(desc,cliente);
		Producto producto;
		String nombre;
		Double precio;
		int cantidad;
		
		for(int i = 0; i < 2; i++) {
			producto = new Producto();
			System.out.print ("Ingrese producto n. "+ producto.getCodigo()+ " :");
			
			System.out.println("Ingrese nombre: ");
			nombre = s.nextLine();
			producto.setNombre(nombre);
			
			System.out.println("Ingrese precio: ");
			precio = s.nextDouble();
			producto.setPrecio(precio);
			
			System.out.println("Ingrese cantidad: ");
			cantidad = s.nextInt();
			
			ItemFactura items = new ItemFactura(cantidad, producto);
			factura.addItemFactura(items);
			s.nextLine();
						
		}
		System.out.println(factura.detalle());
	}

}
