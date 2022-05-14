package test.testdoubles.poquercontinuacion;

import java.util.List;

public class PokerStatus {

	public String verificar(String cartaUno, String cartaDos, String cartaTres, String cartaCuatro, String cartaCinco) {
		List<String> cartas = List.of(cartaUno, cartaDos, cartaTres, cartaCuatro, cartaCinco);
		return jugadaMasSignificativaEn(cartas);
	}

	private String jugadaMasSignificativaEn(List<String> cartas) {
		if (cartas.stream().anyMatch(carta -> hayPokerEn(cartas, carta)))
			return "Poker";
		if (hayColorEn(cartas, cartas.get(0)))
			return "Color";
		if (cartas.stream().anyMatch(carta -> hayTrioEn(cartas, carta)))
			return "Trio";
		return "Nada";
	}

	private boolean hayPokerEn(List<String> listaDeCartas, String unaCarta) {
		return listaDeCartas.stream().filter(carta -> carta.contains(valorDe(unaCarta))).count() >= 4;
	}

	private boolean hayColorEn(List<String> listaDeCartas, String unaCarta) {
		String colorDePrimeraCarta = colorDe(unaCarta);
		return listaDeCartas.stream().allMatch(carta -> carta.contains(colorDePrimeraCarta));
	}

	private boolean hayTrioEn(List<String> listaDeCartas, String unaCarta) {
		return listaDeCartas.stream().filter(carta -> carta.contains(valorDe(unaCarta))).count() == 3;
	}

	private String paloDe(String unaCarta) {
		return unaCarta.substring(unaCarta.length() - 2);
	}
	
	private String colorDe(String unaCarta) {
		return unaCarta.substring(unaCarta.length() - 1);
	}

	private String valorDe(String unaCarta) {
		return unaCarta.substring(0, unaCarta.length() - 2);
	}
}
