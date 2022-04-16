package supermercado.ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrabajadorTest {

	Ingreso ingreso1;
	Ingreso ingreso2;
	Ingreso ingreso3;
	Trabajador diego;

	@BeforeEach
	void setUp() {
		ingreso1 = new Ingreso("Octubre", "Programming", 75.0);
		ingreso2 = new IngresoHorasExtras("Noviembre", "Programming", 100.0, 30);
		ingreso3 = new Ingreso("Diciembre", "Programming", 25.0);
		diego = new Trabajador();
		diego.addIngreso(ingreso1).addIngreso(ingreso2).addIngreso(ingreso3);
	}

	@Test
	void testConstructorIngreso() {
		assertEquals(ingreso1.getMonto(), 75.0);
	}

	@Test
	void testConstructorIngresoHorasExtras() {
		assertEquals(ingreso2.getMonto(), 100.0);
	}
	
	@Test
	void testTrabajadorTotalPercibido() {
		assertEquals(diego.getTotalPercibido(), 200.0);
	}
	
	@Test
	void testTrabajadorMontoImponible() {
		assertEquals(diego.getMontoImponible(), 100.0);
	}
	
	@Test
	void testTrabajadorImpuestoAPagar() {
		assertEquals(diego.getImpuestoAPagar(), 2.0);
	}
}
