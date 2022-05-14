package test.testdoubles.jugadasdepoquer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.util.List;

public class PokerStatusTest {
	
	PokerStatus pokerStatus1;
	PokerStatus pokerStatus2;
	Jugada jugada;
	Carta ochoD, diezD, ochoP, ochoT, tresT;
	
	@BeforeEach
	void setUp() throws Exception {
		pokerStatus1 = new PokerStatus();
		ochoD = new Carta("8", "D");
        ochoT = new Carta("8", "T");
        diezD = new Carta("10", "D");
        tresT = new Carta("3", "T");
        jugada = mock(Jugada.class);
	}
	
	@Test
	void testEsJugadaPoker() {
		Jugada jugada = pokerStatus1.verificar(diezD, ochoD, ochoT, ochoT, ochoT);
		jugada.setTipoJugada(new Poker());
		Jugada expectedJugada = new Jugada(new Poker(), List.of(diezD, ochoD, ochoT, ochoT, ochoT));
		assertEquals(jugada.getTipo().getClass(), expectedJugada.getTipo().getClass());
	}
	
	@Test
	void testJugadaGanadoraEsPoker() {
		Jugada jugada = pokerStatus1.verificar(diezD, ochoD, ochoT, ochoT, ochoT);
		
		Jugada expectedJugada = new Jugada(new Poker(), List.of(diezD, ochoD, ochoT, ochoT, ochoT));
		assertEquals(jugada.getTipo().getClass(), expectedJugada.getTipo().getClass());
	}

}
