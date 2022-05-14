package test.testdoubles.jugadasdepoquer;

import java.util.List;

public class PokerStatus {
	private Jugada jugada;
	
	public Jugada verificar(Carta cartaUno, Carta cartaDos, Carta cartaTres, Carta cartaCuatro, Carta cartaCinco) {
		List<Carta> cartas = List.of(cartaUno, cartaDos, cartaTres, cartaCuatro, cartaCinco);
		return jugadaMasSignificativaEn(cartas);
	}

	private Jugada jugadaMasSignificativaEn(List<Carta> cartas) {
		this.jugada = new Jugada(new Nada(), cartas);
		if (cartas.stream().anyMatch(carta -> hayPokerEn(cartas, carta)))
			jugada.setTipoJugada(new Poker());
		if (hayColorEn(cartas, cartas.get(0)))
			jugada.setTipoJugada(new Color());
		if (cartas.stream().anyMatch(carta -> hayTrioEn(cartas, carta)))
			jugada.setTipoJugada(new Trio());
		return jugada;
	}

	private boolean hayPokerEn(List<Carta> listaDeCartas, Carta unaCarta) {
		return listaDeCartas.stream().filter(carta -> carta.esMismoValorQue(unaCarta)).count() >= 4;
	}

	private boolean hayColorEn(List<Carta> listaDeCartas, Carta unaCarta) {
		return listaDeCartas.stream().allMatch(carta -> carta.esMismoPaloQue(unaCarta));
	}

	private boolean hayTrioEn(List<Carta> listaDeCartas, Carta unaCarta) {
		return listaDeCartas.stream().filter(carta -> carta.esMismoValorQue(unaCarta)).count() == 3;
	}
}
