package isi.died.tp.dominio;

import java.util.List;

import isi.died.tp.dominio.Insumo;

public class GestorInsumos{
	private static GestorInsumos gestor;
	
	private GestorInsumos(){}
	public static GestorInsumos getGestor() {
		if(gestor == null)	gestor = new GestorInsumos();
		return gestor;
	}
	public void crear(String descrip, Double costoActual, Double pesoEnKg, Boolean refrigeracion, UnidadDeMedida unidad) {
		new Insumo(descrip, costoActual, pesoEnKg, refrigeracion, unidad);
	}
	public void buscar() {
		List<Insumo> insumos = Insumo.getInstances();

	}
	public void editar() {
		
	}
	public void eliminiar() {
		
	}
	
}