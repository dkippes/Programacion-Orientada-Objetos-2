package ar.com.unq.po2.tp3.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.com.unq.po2.tp3.ejercicio8.Point;

public class CuadradoTest {
	
	Point point;
	Cuadrado cuadrado;
	
	@BeforeEach
	void setUp() {
		point = new Point(3, 3);
		cuadrado = new Cuadrado(point);
	}

	@Test
	void shouldBeACuadrado() {
		assertEquals(cuadrado.getPoint().getX(), 3);
		assertEquals(cuadrado.getPoint().getY(), 3);
	}
	
	@Test
	void shouldCalculateArea() {
		assertEquals(cuadrado.calculateLado(), 3);
		assertEquals(cuadrado.calculateArea(), 9);
	}
	
	@Test
	void shouldCalculatePerimetro() {
		assertEquals(cuadrado.calculatePerimetro(), 12);
	}
}
