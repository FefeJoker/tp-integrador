package isi.died.tp.estructuras;

import static org.junit.Assert.*;

import isi.died.tp.dominio.Insumo;
import isi.died.tp.dominio.Liquido;
import isi.died.tp.dominio.Unidad;
import isi.died.tp.dominio.UnidadDeMasa;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestRangoABB {


	private ArbolBinarioBusqueda <Insumo> arbolInsumos;

	private Liquido liq1;
	private Liquido liq2;
	private Liquido liq3;
	private Liquido liq4;
	private Liquido liq5;
	private UnidadDeMasa unidad1;
	private UnidadDeMasa unidad2;

	List<Insumo> listaCorrecta;

	@Before
	public void preTest() {

		unidad1 = new UnidadDeMasa(Unidad.KILO);
		unidad2 = new UnidadDeMasa(Unidad.GRAMO);

		liq1 = new Liquido(1, "",
				20.0, 10.0, 1.0, false, unidad1, 1.14);
		liq2 = new Liquido(2, "",
				20.0, 8.0, 25.0, false, unidad1, 1.14);
		liq3 = new Liquido(3, "",
				20.0, 50.0, 10.0, false, unidad1, 1.14);
		liq4 = new Liquido(4, "",
				20.0, 25.0, 0.8, true, unidad2, 1.14);
		liq5 = new Liquido(5, "", 23.0,
				12.0, 18.0, false, unidad1, 1.14);


		listaCorrecta = new ArrayList<>();

		arbolInsumos = new ArbolBinarioBusqueda<>(liq1);
		listaCorrecta.add(liq1);
		arbolInsumos.agregar(liq2);
		arbolInsumos.agregar(liq3);
		arbolInsumos.agregar(liq4);
		listaCorrecta.add(liq4);
		arbolInsumos.agregar(liq5);
		listaCorrecta.add(liq5);
	}

	@Test
	public void test() {

		List<Insumo> liquidosRango;
		liquidosRango = new ArrayList<>();

		liquidosRango = arbolInsumos.rango(liq1,liq4);

		assertEquals(listaCorrecta,liquidosRango);
	}

}
