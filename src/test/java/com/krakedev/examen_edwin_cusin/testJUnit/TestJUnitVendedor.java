package com.krakedev.examen_edwin_cusin.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.examen_edwin_cusin.entidades.Vendedor;

/**
 * Clase de pruebas unitarias para el método calcularSueldo
 */
public class TestJUnitVendedor {

	/**
	 * Caso positivo:
	 * Verifica que el método calcularSueldo
	 * retorne correctamente el sueldo fijo.
	 */
	@Test
	public void testCalcularSueldoCorrecto() {

		Vendedor vendedor = new Vendedor("1728394050","V");

		vendedor.setSueldoFijo(850.75);

		double resultado = vendedor.calcularSueldo();

		assertEquals(850.75, resultado);
		assertTrue(resultado > 0);
	}

	/**
	 * Caso negativo:
	 * Verifica que el sueldo calculado
	 * no sea un valor incorrecto.
	 */
	@Test
	public void testCalcularSueldoIncorrecto() {

		Vendedor vendedor = new Vendedor("0102030405","V");

		vendedor.setSueldoFijo(600);

		double resultado = vendedor.calcularSueldo();

		assertFalse(resultado == 1000);
	}
}