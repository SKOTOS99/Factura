package com.factura.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
	
	public static Date formateaFecha(Date fecha) {
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		format.format(fecha);
		return fecha;
		
		
	}

}
