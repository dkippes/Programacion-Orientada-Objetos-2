package test.testdoubles.cartasdepoquer;

import java.util.List;

public class PokerStatus {
	public String verificar(Carta cartaUno, Carta cartaDos, Carta cartaTres, Carta cartaCuatro, Carta cartaCinco) {
		List<Carta> cartas = List.of(cartaUno, cartaDos, cartaTres, cartaCuatro, cartaCinco);
		return jugadaMasSignificativaEn(cartas);
	}

	private String jugadaMasSignificativaEn(List<Carta> cartas) {
		if (cartas.stream().anyMatch(carta -> hayPokerEn(cartas, carta)))
			return "Poker";
		if (hayColorEn(cartas, cartas.get(0)))
			return "Color";
		if (cartas.stream().anyMatch(carta -> hayTrioEn(cartas, carta)))
			return "Trio";
		return "Nada";
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
