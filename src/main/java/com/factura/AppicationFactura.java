package com.factura;

import java.util.Scanner;

import com.factura.models.Cliente;
import com.factura.models.Factura;
import com.factura.models.ItemFactura;
import com.factura.models.Producto;

public class AppicationFactura {
	
	public static void main(String[] args) {
		boolean continuar = true;
		while(continuar) {
			Cliente cliente = new Cliente();
			cliente.setRfc("MECF45746");
			cliente.setNombre("Jesus");
			Scanner s  = new Scanner(System.in);
			
			System.out.println("Ingrese la descripcion de la factura...");
			String desc = s.nextLine();
			Factura factura = new Factura(desc,cliente);
			Producto producto;
			boolean bandera = true;
			while(bandera) {
				producto = new Producto();
				System.out.println("Ingrese producto n. "+ producto.getCodigo()+ " :");
				
				System.out.println("Ingrese nombre: ");
				producto.setNombre(s.nextLine());
				
				System.out.println("Ingrese precio: ");
				producto.setPrecio(s.nextDouble());
				
				System.out.println("Ingrese cantidad: ");
				factura.addItemFactura(new ItemFactura(s.nextInt(), producto));
				
				System.out.println("Desea agregar mas productos? y/n");
				bandera = s.next().equals("y") ? true : false;
				s.nextLine();
							
			}
			System.out.println(factura);
			System.out.println("Desea generar otra factura? y/n");
			continuar = s.next().endsWith("y") ? true : false;
			
		}
		
	}

}
