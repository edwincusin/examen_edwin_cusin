package com.krakedev.examen_edwin_cusin.test;

import com.krakedev.examen_edwin_cusin.entidades.Vendedor;
import com.krakedev.examen_edwin_cusin.entidades.VendedorComision;
import com.krakedev.examen_edwin_cusin.entidades.VendedorMixto;
import com.krakedev.examen_edwin_cusin.servicios.AdminVentas;

public class TestAdmin {

	public static void main(String[] args) {
		
		//	Instanciar AdminVentas 
		AdminVentas av = new AdminVentas();
		
		//Crear un Vendedor, un VendedorComision y un VendedorMixto 
		//Setear los datos necesarios para calcular los sueldos 
		Vendedor vendedor = new Vendedor("1753081056");
		vendedor.setComisionPorVenta(5.2);
		vendedor.setNumeroVentas(20);
		vendedor.setSueldoFijo(450);

		VendedorComision vendedorComision = new VendedorComision("10053081056");
		vendedorComision.setComisionPorVenta(2);
		vendedorComision.setNumeroVentas(40);
		vendedorComision.setSueldoFijo(450);

		VendedorMixto vendedorMixto = new VendedorMixto("0012345678");
		vendedorMixto.setComisionPorVenta(1);
		vendedorMixto.setNumeroVentas(50);
		vendedorMixto.setSueldoFijo(450);
		
		//	Agregar los vendedores usando el método agregar 
		av.agregar(vendedor);
		av.agregar(vendedorComision);
		av.agregar(vendedorMixto);
		
		//Probar el método calcularSueldo con los tres vendedores 
		System.out.println("Sueldo vendedor normal: " + av.calcularSueldo("1753081056"));
		System.out.println("Solo Comision --- > vendedor comision: " + av.calcularSueldo("10053081056")); // asi essta en las indicaciones 
		System.out.println("Sueldo vendedor mixto: " + av.calcularSueldo("0012345678"));
		
		
		//		•	Probar con una cédula inexistente 

		System.out.println("Cedula inexistente: " + av.calcularSueldo("0000888888"));

	}

}
