package isi.died.tp.estructuras;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.sql.SQLOutput;

public class ArbolBinarioBusquedaTest {

	private ArbolBinarioBusqueda <Integer> abb1;
	private ArbolBinarioBusqueda <Integer> abb2;
	private ArbolBinarioBusqueda <Integer> abb3;
	private ArbolBinarioBusqueda <Integer> abb4;
	private ArbolBinarioBusqueda <Integer> abb5;
	private ArbolBinarioBusqueda <Integer> abb6;
	private ArbolBinarioBusqueda <Integer> abb7;

	@Before
	public void preTest(){
		abb1 = new ArbolBinarioBusqueda<>(20);


		abb2 = new ArbolBinarioBusqueda<>(20);
		abb2.agregar(2);

		abb3 = new ArbolBinarioBusqueda<>(20);
		abb3.agregar(2);
		abb3.agregar(23);

		abb4 = new ArbolBinarioBusqueda<>(20);
		abb4.agregar(10);
		abb4.agregar(5);

		abb5 = new ArbolBinarioBusqueda<>(20);
		abb5.agregar(10);
		abb5.agregar(5);
		abb5.agregar(23);

		abb6 = new ArbolBinarioBusqueda<>(20);
		abb6.agregar(10);
		abb6.agregar(23);
		abb6.agregar(22);

		abb7 = new ArbolBinarioBusqueda<>(20);
		abb7.agregar(10);
		abb7.agregar(5);
		abb7.agregar(23);
		abb7.agregar(21);
	}

	@Test
	public void testContiene() {

		System.out.println("Abb1 contiene 20: " + abb1.contiene(20));
		System.out.println("Abb2 contiene 20: " + abb2.contiene(20));
		System.out.println("Abb3 contiene 20: " + abb3.contiene(20));
		System.out.println("Abb4 contiene 10: " + abb4.contiene(10));
		System.out.println("Abb5 contiene 50: " + abb5.contiene(50));
		System.out.println("Abb6 contiene 22: " + abb6.contiene(22));

		//fail("Not yet implemented");
	}

	@Test
	public void testEqualsArbolOfE() {
		fail("Not yet implemented");
	}

	@Test
	public void testAgregar() {
		fail("Not yet implemented");
	}

	@Test
	public void testProfundidad() {
		System.out.println("Abb1 profundidad: "+ abb1.profundidad());
		System.out.println("Abb2 profundidad: "+ abb2.profundidad());
		System.out.println("Abb3 profundidad: "+ abb3.profundidad());
		System.out.println("Abb4 profundidad: "+ abb4.profundidad());
		System.out.println("Abb5 profundidad: "+ abb5.profundidad());
		System.out.println("Abb6 profundidad: "+ abb6.profundidad());

		//fail("Not yet implemented");
	}

	@Test
	public void testCuentaNodosDeNivel() {

		System.out.println("Abb1 nodos en nivel 1: "+ abb1.cuentaNodosDeNivel(1));
		System.out.println("Abb2 nodos en nivel 2: "+ abb2.cuentaNodosDeNivel(2));
		System.out.println("Abb3 nodos en nivel 2: "+ abb3.cuentaNodosDeNivel(2));
		System.out.println("Abb4 nodos en nivel 3: "+ abb4.cuentaNodosDeNivel(3));
		System.out.println("Abb5 nodos en nivel 2: "+ abb5.cuentaNodosDeNivel(2));
		System.out.println("Abb6 nodos en nivel 3: "+ abb6.cuentaNodosDeNivel(3));
		//fail("Not yet implemented");
	}

	@Test
	public void testEsCompleto() {
		System.out.println("Abb1 es completo: "+abb1.esCompleto());
		System.out.println("Abb2 es completo: "+abb2.esCompleto());
		System.out.println("Abb3 es completo: "+abb3.esCompleto());
		System.out.println("Abb4 es completo: "+abb4.esCompleto());
		System.out.println("Abb5 es completo: "+abb5.esCompleto());
		System.out.println("Abb6 es completo: "+abb6.esCompleto());
		System.out.println("Abb7 es completo: "+abb7.esCompleto());

		//fail("Not yet implemented");
	}

	@Test
	public void testEsLleno() {
		System.out.println("Abb1 es lleno: "+abb1.esLleno());
		System.out.println("Abb2 es lleno: "+abb2.esLleno());
		System.out.println("Abb3 es lleno: "+abb3.esLleno());
		System.out.println("Abb4 es lleno: "+abb4.esLleno());
		System.out.println("Abb5 es lleno: "+abb5.esLleno());
		System.out.println("Abb6 es lleno: "+abb6.esLleno());

		//fail("Not yet implemented");
	}

}
