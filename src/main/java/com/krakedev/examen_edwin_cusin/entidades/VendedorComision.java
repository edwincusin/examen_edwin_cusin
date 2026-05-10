package com.krakedev.examen_edwin_cusin.entidades;

public class VendedorComision extends Vendedor{

	public VendedorComision(String cedula, String tipo) {
		super(cedula,tipo);
	}
	//Debe retornar el valor de la comisión por venta multiplicado por el número de ventas.
	@Override
	public double calcularSueldo() {
		
		double res=super.getComisionPorVenta()*super.getNumeroVentas();
		return res;
	}
	
}
