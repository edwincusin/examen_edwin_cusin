package com.krakedev.examen_edwin_cusin.entidades;

public class VendedorMixto extends Vendedor {

	public VendedorMixto(String cedula, String tipo) {
		super(cedula,tipo);
	}
	
	//Debe retornar el sueldo fijo más el 1% del sueldo fijo por cada venta realizada.
	@Override
	public double calcularSueldo() {
		double rest = (super.getSueldoFijo() * 0.01) * super.getNumeroVentas();
		return super.getSueldoFijo() + rest;
	}
	
	
}
