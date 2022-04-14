package ar.com.unq.po2.tp3.ejercicio8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PointTest {
	
	Point point00;
	Point point39;
	Point point34;
	Point point26;

	@BeforeEach
	void setUp() {
		point00 = new Point();
		point39 = new Point(3, 9);
		point34 = new Point(3, 4);
		point26 = new Point(2, 6);
	}
	
	@Test
	void testCreacionPorReferencia() {
		assertEquals(point39.getX(), 3);
		assertEquals(point39.getY(), 9);
	}
	
	@Test
	void testCreacionPorReferenciaSinParametros() {
		assertEquals(point00.getX(), 0);
		assertEquals(point00.getY(), 0);
	}
	
	@Test
	void testMoviendoAOtraPosicion() {
		point00.moverAPosicion(3, 4);
		
		assertEquals(point00.getX(), 3);
		assertEquals(point00.getY(), 4);
	}
	
	@Test
	void testSumarseConOtroPunto() {
		point34.sumarPuntos(point26);
		
		assertEquals(point34.getX(), 5);
		assertEquals(point34.getY(), 10);
	}
}
