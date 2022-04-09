package ar.com.unq.po2.tp3.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DesarmadorNumerosTest {
	
	DesarmadorNumeros desarmadorNumeros;
	
	@BeforeEach
	void setUp() {
		desarmadorNumeros = new DesarmadorNumeros();
		desarmadorNumeros.addNumero(20)
			.addNumero(2223)
			.addNumero(990)
			.addNumero(5782);
	}
	
	@Test
	void shouldReturn() {
		assertEquals(desarmadorNumeros.numeroConMayorNumerosPares(), 2223);
	}
	
}
