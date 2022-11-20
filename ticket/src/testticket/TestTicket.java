package testticket;

import static org.junit.Assert.*;

import org.junit.Test;

import ticket.Ticket;

public class TestTicket {

	@Test
	public void calcularSubtotalTest() {
		Ticket t1 = new Ticket();
		t1.agregarItem(3, 5000);
		double subtotalEsperado = 15000;
		double subtotalObtenido = t1.calcularSubtotal();
		assertEquals(subtotalEsperado, subtotalObtenido, 0.01);

		t1.agregarItem(1, 2000);
		double subtotalEsperado2 = 17000;
		double subtotalObtenido2 = t1.calcularSubtotal();
		assertEquals(subtotalEsperado2, subtotalObtenido2, 0.01);
	}

	@Test
	public void agregarItemTest() {
		Ticket t1 = new Ticket();
		t1.agregarItem(3, 1000);
		double importeEsperado = 3000;
		double importeObtenido = t1.getImporte();
		assertEquals(importeEsperado, importeObtenido, 0.1);

	}

	@Test
	public void calcularTotalTest() {
		Ticket t1 = new Ticket();
		t1.agregarItem(3, 5000);
		double subtotalEsperado = 15000;
		double subtotalObtenido = t1.calcularSubtotal();
		assertEquals(subtotalEsperado, subtotalObtenido, 0.01);
		
		double importeEsp1 = 15000;
		double importeObt1 = t1.getImporte();
		assertEquals(importeEsp1, importeObt1, 0.01);
		
		t1.agregarItem(1, 2000);
		double subtotalEsperado2 = 17000;
		double subtotalObtenido2 = t1.calcularSubtotal();
		assertEquals(subtotalEsperado2, subtotalObtenido2, 0.01);
		
		double importeEsp2 = 2000;
		double importeObt2 = t1.getImporte();
		assertEquals(importeEsp2, importeObt2, 0.01);
		
		double importeTotalEsp = t1.calcularTotal();
		double importeTotalObt = 17000;
		assertEquals(importeTotalEsp, importeTotalObt, 0.01);
		
		double importeTotalEsp2 = 0;
		double importeTotalObt2 = t1.calcularTotal();
		assertEquals(importeTotalEsp2, importeTotalObt2, 0.01);
	}
	
	@Test(expected = Error.class)
	public void agregarItemConValoresNoValidosTest() {
		Ticket t1 = new Ticket();
		t1.agregarItem(-3, 1000);
	}
	

}
