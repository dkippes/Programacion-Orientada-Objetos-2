package test.testdoubles.jugadasdepoquer;

import java.util.List;

import test.testdoubles.cartasdepoquer.Carta;

public class PokerStatus {
	public String verificar(Carta cartaUno, Carta cartaDos, Carta cartaTres, Carta cartaCuatro, Carta cartaCinco) {
		List<Carta> cartas = List.of(cartaUno, cartaDos, cartaTres, cartaCuatro, cartaCinco);
		return jugadaMasSignificativaEn(cartas);
	}

	private String jugadaMasSignificativaEn(List<Carta> cartas) {
		if (hayColorEn(cartas, cartas.get(0)))
			return "Color";
		if (cartas.stream().anyMatch(carta -> hayPokerEn(cartas, carta)))
			return "Poker";
		if (cartas.stream().anyMatch(carta -> hayTrioEn(cartas, carta)))
			return "Trio";
		return "Nada";
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
