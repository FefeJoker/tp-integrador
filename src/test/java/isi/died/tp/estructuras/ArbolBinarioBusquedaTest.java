package isi.died.tp.estructuras;

import static org.junit.Assert.*;

import isi.died.tp.dominio.*;
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


		assertTrue(abb1.contiene(20));
		assertTrue(abb2.contiene(20));
		assertTrue(abb3.contiene(20));
		assertTrue(abb4.contiene(10));
		assertFalse(abb5.contiene(50));
		assertTrue(abb6.contiene(22));
		assertFalse(abb7.contiene(11));
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

		assertEquals(0,abb1.profundidad());
		assertEquals(1,abb2.profundidad());
		assertEquals(1,abb3.profundidad());
		assertEquals(2,abb4.profundidad());
		assertEquals(2,abb5.profundidad());
		assertEquals(2,abb6.profundidad());
		assertEquals(2,abb7.profundidad());

		//fail("Not yet implemented");
	}

	@Test
	public void testCuentaNodosDeNivel() {


		assertEquals(0,abb1.cuentaNodosDeNivel(1));
		assertEquals(1,abb2.cuentaNodosDeNivel(1));
		assertEquals(2,abb3.cuentaNodosDeNivel(1));
		assertEquals(1,abb4.cuentaNodosDeNivel(1));
		assertEquals(2,abb5.cuentaNodosDeNivel(1));
		assertEquals(1,abb6.cuentaNodosDeNivel(2));
		assertEquals(2,abb7.cuentaNodosDeNivel(2));

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

		assertTrue(abb1.esCompleto());
		assertTrue(abb2.esCompleto());
		assertTrue(abb3.esCompleto());
		assertFalse(abb4.esCompleto());
		assertTrue(abb5.esCompleto());
		assertFalse(abb6.esCompleto());
		assertFalse(abb7.esCompleto());

		//fail("Not yet implemented");
	}

	@Test
	public void testEsLleno() {

		assertTrue(abb1.esLleno());
		assertFalse(abb2.esLleno());
		assertTrue(abb3.esLleno());
		assertFalse(abb4.esLleno());
		assertFalse(abb5.esLleno());
		assertFalse(abb6.esLleno());
		assertFalse(abb7.esLleno());

		/*System.out.println("Abb1 es lleno: "+abb1.esLleno());
		System.out.println("Abb2 es lleno: "+abb2.esLleno());
		System.out.println("Abb3 es lleno: "+abb3.esLleno());
		System.out.println("Abb4 es lleno: "+abb4.esLleno());
		System.out.println("Abb5 es lleno: "+abb5.esLleno());
		System.out.println("Abb6 es lleno: "+abb6.esLleno());*/

		//fail("Not yet implemented");
	}

}
