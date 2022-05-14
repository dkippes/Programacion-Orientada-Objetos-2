package test.testdoubles.jugadasdepoquer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PokerStatusTest {
	
	PokerStatus pokerStatus;
	Carta ochoD, diezD, ochoP, ochoT, tresT;
	
	@BeforeEach
	void setUp() throws Exception {
		pokerStatus = new PokerStatus();
        ochoD = new Carta("8", "D", "R");
        ochoT = new Carta("8", "T", "R");
        diezD = new Carta("10", "D", "N");
        tresT = new Carta("3", "T", "N");
	}
	
	@Test
	void testPokerStatusDevuelvePoker() {
		Jugada jugada = pokerStatus.verificar(ochoD, ochoD, ochoT, diezD, ochoT);
		assertEquals(jugada.getTipo().getClass(), new Poker().getClass());
		assertEquals(jugada.getCartas(), List.of(ochoD, ochoD, ochoT, diezD, ochoT));
	}
	
	@Test
	void testPokerStatusDevuelveColor() {
		Jugada jugada = pokerStatus.verificar(tresT, tresT, diezD, diezD, tresT);
		assertEquals(jugada.getTipo().getClass(), new Color().getClass());
		assertEquals(jugada.getCartas(), List.of(tresT, tresT, diezD, diezD, tresT));
	}
	
	@Test
	void testPokerStatusDevuelveTrio() {
		Jugada jugada = pokerStatus.verificar(ochoD, diezD, diezD, diezD, ochoT);
		assertEquals(jugada.getTipo().getClass(), new Trio().getClass());
		assertEquals(jugada.getCartas(), List.of(ochoD, diezD, diezD, diezD, ochoT));
	}
	
	@Test
	void testPokerStatusDevuelveNada() {
		Jugada jugada = pokerStatus.verificar(ochoD, diezD, tresT, tresT, ochoT);
		assertEquals(jugada.getTipo().getClass(), new Nada().getClass());
		assertEquals(jugada.getCartas(), List.of(ochoD, diezD, tresT, tresT, ochoT));
	}
}
