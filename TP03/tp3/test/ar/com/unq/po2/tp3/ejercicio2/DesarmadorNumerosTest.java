package ar.com.unq.po2.tp3.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DesarmadorNumerosTest {
	
	DesarmadorNumeros desarmadorNumeros;
	
	@BeforeEach
	void setUp() {
		desarmadorNumeros = new DesarmadorNumeros();
	}
	
	@Test
	void shouldReturn2223() throws Exception {
		int[] numeros = {20, 2223, 990, 5782};
		assertEquals(desarmadorNumeros.numeroConMayorNumerosPares(numeros), 2223);
	}
	
	@Test
	void shouldThrowAnException() {
		int[] numeros = {};
		assertThrows(Exception.class, () -> desarmadorNumeros.numeroConMayorNumerosPares(numeros));
	}
}
