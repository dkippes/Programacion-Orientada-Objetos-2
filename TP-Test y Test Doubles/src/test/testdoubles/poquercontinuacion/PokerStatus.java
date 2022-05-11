package test.testdoubles.poquercontinuacion;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PokerStatus {

	public String verificar(String cartaUno, String cartaDos, String cartaTres, String cartaCuatro, String cartaCinco) {
		List<String> cartas = List.of(cartaUno, cartaDos, cartaTres, cartaCuatro, cartaCinco);
		return jugadaMasSignificativaEn(cartas);
	}

	private String jugadaMasSignificativaEn(List<String> cartas) {
		if (hayColorEn(cartas, cartas.get(0)))
			return "Color";
		if (cartas.stream().anyMatch(carta -> hayPokerEn(cartas, carta)))
			return "Poker";
		if (cartas.stream().anyMatch(carta -> hayTrioEn(cartas, carta)))
			return "Trio";
		return "Nada";
	}

	private boolean hayPokerEn(List<String> listaDeCartas, String unaCarta) {
		return listaDeCartas.stream().filter(carta -> carta.contains(valorDe(unaCarta))).count() >= 4;
	}

	private boolean hayColorEn(List<String> listaDeCartas, String unaCarta) {
		return listaDeCartas.stream().allMatch(carta -> carta.contains(paloDe(unaCarta)));
	}

	private boolean hayTrioEn(List<String> listaDeCartas, String unaCarta) {
		return listaDeCartas.stream().filter(carta -> carta.contains(valorDe(unaCarta))).count() == 3;
	}

	private String paloDe(String unaCarta) {
		return unaCarta.substring(unaCarta.length() - 1);
	}

	private String valorDe(String unaCarta) {
		return unaCarta.substring(0, unaCarta.length() - 1);
	}
}
