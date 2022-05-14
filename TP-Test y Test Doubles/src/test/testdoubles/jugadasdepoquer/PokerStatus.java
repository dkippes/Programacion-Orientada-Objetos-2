package test.testdoubles.jugadasdepoquer;

import java.util.List;

public class PokerStatus {
	
	public Jugada verificar(Carta cartaUno, Carta cartaDos, Carta cartaTres, Carta cartaCuatro, Carta cartaCinco) {
		List<Carta> cartas = List.of(cartaUno, cartaDos, cartaTres, cartaCuatro, cartaCinco);
		return jugadaMasSignificativaEn(cartas);
	}

	private Jugada jugadaMasSignificativaEn(List<Carta> cartas) {
		if (cartas.stream().anyMatch(carta -> hayPokerEn(cartas, carta)))
			return new Jugada(new Poker(), cartas);
		if (hayColorEn(cartas, cartas.get(0)))
			return new Jugada(new Color(), cartas);
		if (cartas.stream().anyMatch(carta -> hayTrioEn(cartas, carta)))
			return new Jugada(new Trio(), cartas);
		return new Jugada(new Nada(), cartas);
	}

	private boolean hayPokerEn(List<Carta> listaDeCartas, Carta unaCarta) {
		return listaDeCartas.stream().filter(carta -> carta.esMismoValorQue(unaCarta)).count() >= 4;
	}

	private boolean hayColorEn(List<Carta> listaDeCartas, Carta unaCarta) {
		return listaDeCartas.stream().allMatch(carta -> carta.esMismoColor(unaCarta));
	}

	private boolean hayTrioEn(List<Carta> listaDeCartas, Carta unaCarta) {
		return listaDeCartas.stream().filter(carta -> carta.esMismoValorQue(unaCarta)).count() == 3;
	}
}
