package com.krakedev.examen_edwin_cusin.servicios;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.krakedev.examen_edwin_cusin.entidades.Vendedor;

@Service
public class AdminVentas {
	private ArrayList<Vendedor> vendedores=new ArrayList<Vendedor>();
	
	//metodo agregar
	public void agregar(Vendedor vendedor) {
		vendedores.add(vendedor);
	}
	
	//calcularsueldo
	public Double calcularSueldo(String cedula) {

		for (Vendedor v : vendedores) {

			if (v.getCedula().equals(cedula)) {
				return v.calcularSueldo();
			}
		}
		return null;
	}
	
	//metodo ver todos los vendedoress
	public ArrayList<Vendedor> listar(){
		return vendedores;
	}
	
}
