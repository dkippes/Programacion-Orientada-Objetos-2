package ar.com.unq.po2.tp3.ejercicio8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PointTest {

	@BeforeEach
	void setUp() {
	}
	
	@Test
	void testCreacionPorReferencia() {
		Point point = new Point(3, 9);
		assertEquals(point.getX(), 3);
		assertEquals(point.getY(), 9);
	}
	
	@Test
	void testCreacionPorReferenciaSinParametros() {
		Point point = new Point();
		assertEquals(point.getX(), 0);
		assertEquals(point.getY(), 0);
	}
	
	@Test
	void testMoviendoAOtraPosicion() {
		// Arrange
		Point point = new Point();
		
		// Act
		point.moverAPosicion(3, 4);
		
		// Assert
		assertEquals(point.getX(), 3);
		assertEquals(point.getY(), 4);
	}
	
	@Test
	void testSumarseConOtroPunto() {
		// Arrange
		Point point1 = new Point(3, 4);
		Point point2 = new Point(2, 6);
		
		// Act
		point1.sumarPuntos(point2);
		
		// Assert
		assertEquals(point1.getX(), 5);
		assertEquals(point1.getY(), 10);
	}
}
