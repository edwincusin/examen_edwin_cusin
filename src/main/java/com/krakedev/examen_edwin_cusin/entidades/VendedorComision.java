package com.krakedev.examen_edwin_cusin.entidades;

public class VendedorComision extends Vendedor{

	public VendedorComision(String cedula) {
		super(cedula);
	}

	@Override
	public double calcularSueldo() {
		
		double res=super.getComisionPorVenta()*super.getNumeroVentas();
		return res;
	}
	
}
