package test.testdoubles.jugadasdepoquer;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;

public class JugadaTest {
	Jugada jugada1, jugada2;
	PokerStatus pokerStatus;
	Carta ochoD, diezT;
	
	@Spy
	private List<Carta> cartas = new ArrayList<>();

	@BeforeEach
	void setUp() throws Exception {
		jugada1 = new Jugada(new Poker(), List.of());
		jugada2 = mock(Jugada.class);
		pokerStatus = mock(PokerStatus.class);
        ochoD = new Carta("8", "D", "R");
        diezT = new Carta("J", "T", "R");
	}
	
	@Test
	void testLaJugadaDePokerLeGanaAColor() {
		when(jugada2.getTipo()).thenReturn(new Color());
		assertTrue(jugada1.soyGanadora(jugada2));
	}
	

	@Test
	void testLaJugadaDeColorNoLeGanaAPoker() {
		Jugada jugada = new Jugada(new Color(), List.of());
		when(jugada2.getTipo()).thenReturn(new Poker());
		assertFalse(jugada.soyGanadora(jugada2));
	}
	
	@Test
	void testLaJugadaDePokerLeGanaANada() {
		when(jugada2.getTipo()).thenReturn(new Nada());
		assertTrue(jugada1.soyGanadora(jugada2));
	}
	
	@Test
	void testLaJugadaDeColorLeGanaATrio() {
		Jugada jugada = new Jugada(new Color(), List.of());
		when(jugada2.getTipo()).thenReturn(new Trio());
		assertTrue(jugada.soyGanadora(jugada2));
	}
	
	@Test
	void testLaJugadaDeTrioNoLeGanaAColor() {
		Jugada jugada = new Jugada(new Trio(), List.of());
		when(jugada2.getTipo()).thenReturn(new Color());
		assertFalse(jugada.soyGanadora(jugada2));
	}
	
	@Test
	void testLaJugadaDeColorLeGanaANada() {
		Jugada jugada = new Jugada(new Color(), List.of());
		when(jugada2.getTipo()).thenReturn(new Nada());
		assertTrue(jugada.soyGanadora(jugada2));
	}
	
	@Test
	void testLaJugadaDeTrioLeGanaANada() {
		Jugada jugada = new Jugada(new Trio(), List.of());
		when(jugada2.getTipo()).thenReturn(new Nada());
		assertTrue(jugada.soyGanadora(jugada2));
	}
	
	@Test
	void testLaJugadaDeNadaNoLeGanaATrio() {
		Jugada jugada = new Jugada(new Nada(), List.of());
		when(jugada2.getTipo()).thenReturn(new Trio());
		assertFalse(jugada.soyGanadora(jugada2));
	}
	
	@Test
	void testLaJugadaDeNadaNoLeGanaAColor() {
		Jugada jugada = new Jugada(new Nada(), List.of());
		when(jugada2.getTipo()).thenReturn(new Color());
		assertFalse(jugada.soyGanadora(jugada2));
	}
	
	@Test
	void testGanaLaJugadaPorqueTieneMasValoracionDeCartas() {
		Jugada jugada = new Jugada(new Color(), List.of(ochoD, ochoD, ochoD, ochoD, ochoD));
		when(jugada2.getTipo()).thenReturn(new Color());
		when(jugada2.getCartas()).thenReturn(List.of(ochoD, ochoD, ochoD, ochoD, ochoD));
		assertTrue(jugada.soyGanadora(jugada2));
	}
	
	@Test
	void testNoGanaLaJugadaPorqueNoTieneTantaValoracionDeCartas() {
		Jugada jugada = new Jugada(new Color(), List.of(
				new Carta("8", "D", "R"), 
				new Carta("8", "D", "R"), 
				new Carta("8", "D", "R"), 
				new Carta("8", "D", "R"), 
				new Carta("8", "D", "R")));
		cartas.add(new Carta("10", "D", "R"));
		cartas.add(new Carta("8", "D", "R"));
		cartas.add(new Carta("8", "D", "R"));
		cartas.add(new Carta("8", "D", "R"));
		cartas.add(new Carta("J", "D", "R"));
		when(jugada2.getTipo()).thenReturn(new Color());
		when(jugada2.getCartas()).thenReturn(cartas);
		assertFalse(jugada.soyGanadora(jugada2));
	}
}
