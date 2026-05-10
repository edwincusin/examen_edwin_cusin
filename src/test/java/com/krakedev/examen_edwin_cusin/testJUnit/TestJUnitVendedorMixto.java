package com.krakedev.examen_edwin_cusin.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.examen_edwin_cusin.entidades.VendedorMixto;

/**
 * Pruebas unitarias para la clase VendedorMixto
 */
public class TestJUnitVendedorMixto {

	/**
	 * Caso positivo:
	 * 
	 * Verifica que el sueldo se calcule correctamente:
	 * 
	 * sueldo fijo + (1% del sueldo fijo por cada venta)
	 * 
	 * Ejemplo:
	 * sueldo fijo = 1000
	 * ventas = 5
	 * 
	 * 1% de 1000 = 10
	 * 10 * 5 = 50
	 * Total = 1050
	 */
	@Test
	public void testCalcularSueldoCorrecto() {

		VendedorMixto vendedor = new VendedorMixto("1728394050","V");

		vendedor.setSueldoFijo(1000);
		vendedor.setNumeroVentas(5);

		double resultado = vendedor.calcularSueldo();

		assertEquals(1050, resultado);
		assertTrue(resultado > 1000);
	}

	/**
	 * Caso negativo:
	 * 
	 * Verifica que el sueldo calculado
	 * no sea un valor incorrecto.
	 */
	@Test
	public void testCalcularSueldoIncorrecto() {

		VendedorMixto vendedor = new VendedorMixto("0102030405","V");

		vendedor.setSueldoFijo(800);
		vendedor.setNumeroVentas(2);

		double resultado = vendedor.calcularSueldo();

		assertFalse(resultado == 1000);
	}
}