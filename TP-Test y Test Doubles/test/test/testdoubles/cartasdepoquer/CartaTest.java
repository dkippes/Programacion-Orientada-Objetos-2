package test.testdoubles.cartasdepoquer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CartaTest {
	Carta carta;

	@BeforeEach
	void setUp() throws Exception {
		carta = new Carta("10", "C");
	}

	@Test
	void testCreacionCarta() {
		assertEquals("10", carta.getValor());
		assertEquals("C", carta.getPalo());
	}

	@Test
	void testCartaMismoPalo() {
		Carta cartaAComparar = new Carta("9", "C");
		assertTrue(carta.esMismoPaloQue(cartaAComparar));
	}

	@Test
	void testCartaDiferentePalo() {
		Carta cartaAComparar = new Carta("9", "T");
		assertFalse(carta.esMismoPaloQue(cartaAComparar));
	}

	@Test
	void testCartaSuperiorAOtraCarta() {
		Carta cartaAComparar = new Carta("9", "C");
		assertTrue(carta.esSuperiorA(cartaAComparar));
	}

	@Test
	void testCartaInferiorAOtraCarta() {
		Carta cartaAComparar = new Carta("Q", "C");
		assertFalse(carta.esSuperiorA(cartaAComparar));
	}
}
