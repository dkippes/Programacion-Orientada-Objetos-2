package ar.com.unq.po2.tp3.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import ar.com.unq.po2.tp3.ejercicio1.Counter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test de counter")
class CounterTest {
	
	Counter counter;

	@BeforeEach
	void setUp() {
		counter = new Counter();
		counter
			.addNumer(1)
			.addNumer(3)
			.addNumer(5)
			.addNumer(7)
			.addNumer(9)
			.addNumer(1)
			.addNumer(1)
			.addNumer(1)
			.addNumer(1)
			.addNumer(4);
	}
	

	@Test
	@DisplayName("should return 1 when it executed contarPares")
	void shouldTestContarPares() {
		assertEquals(counter.contarPares(), 1);
	}

	@Test
	@DisplayName("should return 9 when it executed contarImpares")
	void shouldTestContarImpares() {
		assertEquals(counter.contarImpares(), 9);
	}
	
	@Test
	@DisplayName("should return 2 when it executed contarMultiplos(2)")
	void shouldTestContarMultiplos() {
		assertEquals(counter.contarMultiplos(3), 2);
	}
}
