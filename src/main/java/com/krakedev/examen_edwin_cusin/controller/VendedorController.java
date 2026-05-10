package com.krakedev.examen_edwin_cusin.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.examen_edwin_cusin.entidades.Vendedor;
import com.krakedev.examen_edwin_cusin.entidades.VendedorComision;
import com.krakedev.examen_edwin_cusin.entidades.VendedorMixto;
import com.krakedev.examen_edwin_cusin.servicios.AdminVentas;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {

	AdminVentas adminVentas;

	public VendedorController(AdminVentas adminVentas) {
		this.adminVentas = adminVentas;
	}

	@PostMapping
	public void agregar(@RequestBody Vendedor vendedor) {

		Vendedor nuevo = null;

		// Vendedor normal
		if (vendedor.getTipo().equals("V")) {

			nuevo = new Vendedor(vendedor.getCedula(), vendedor.getTipo());

			nuevo.setNumeroVentas(vendedor.getNumeroVentas());
			nuevo.setSueldoFijo(vendedor.getSueldoFijo());
			nuevo.setComisionPorVenta(vendedor.getComisionPorVenta());

			// Invocar método agregar
			adminVentas.agregar(nuevo);
		}

		// Vendedor comisión
		else if (vendedor.getTipo().equals("C")) {

			nuevo = new VendedorComision(vendedor.getCedula(), vendedor.getTipo());

			nuevo.setNumeroVentas(vendedor.getNumeroVentas());
			nuevo.setSueldoFijo(vendedor.getSueldoFijo());
			nuevo.setComisionPorVenta(vendedor.getComisionPorVenta());

			// Invocar método agregar
			adminVentas.agregar(nuevo);
		}

		// Vendedor mixto
		else if (vendedor.getTipo().equals("M")) {

			nuevo = new VendedorMixto(vendedor.getCedula(), vendedor.getTipo());

			nuevo.setNumeroVentas(vendedor.getNumeroVentas());
			nuevo.setSueldoFijo(vendedor.getSueldoFijo());
			nuevo.setComisionPorVenta(vendedor.getComisionPorVenta());

			// Invocar método agregar
			adminVentas.agregar(nuevo);
		}

	}

	@GetMapping("/{cedula}")
	public Double calcularSueldo(@PathVariable String cedula) {
		return adminVentas.calcularSueldo(cedula);
	}
	
	
	//metodo ver todos los vendedoress
	@GetMapping
	public ArrayList<Vendedor> listar(){
		return adminVentas.listar();
	}
	
}
