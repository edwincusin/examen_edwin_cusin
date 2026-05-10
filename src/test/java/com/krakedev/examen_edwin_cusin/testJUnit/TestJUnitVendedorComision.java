package com.krakedev.examen_edwin_cusin.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.examen_edwin_cusin.entidades.VendedorComision;

/**
 * Pruebas unitarias para la clase VendedorComision
 */
public class TestJUnitVendedorComision {

	/**
	 * Caso positivo:
	 * 
	 * Verifica que el sueldo se calcule correctamente
	 * multiplicando:
	 * 
	 * comisionPorVenta * numeroVentas
	 */
	@Test
	public void testCalcularSueldoCorrecto() {

		VendedorComision vendedor = new VendedorComision("1728394050","C");

		vendedor.setComisionPorVenta(25);
		vendedor.setNumeroVentas(4);

		double resultado = vendedor.calcularSueldo();

		assertEquals(100, resultado);
		assertTrue(resultado > 0);
	}

	/**
	 * Caso negativo:
	 * 
	 * Verifica que el resultado NO sea
	 * un valor incorrecto.
	 */
	@Test
	public void testCalcularSueldoIncorrecto() {

		VendedorComision vendedor = new VendedorComision("0102030405","C");

		vendedor.setComisionPorVenta(10);
		vendedor.setNumeroVentas(5);

		double resultado = vendedor.calcularSueldo();

		assertFalse(resultado == 200);
	}
}