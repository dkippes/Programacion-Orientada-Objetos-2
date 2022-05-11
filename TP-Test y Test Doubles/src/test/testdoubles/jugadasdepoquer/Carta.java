package test.testdoubles.jugadasdepoquer;

import test.testdoubles.cartasdepoquer.Carta;

public class Carta {
	private String palo;
	private String valor;

	public Carta(String valor, String palo) {
		this.valor = valor;
		this.palo = palo;
	}

	public String getValor() {
		return valor;
	}

	public String getPalo() {
		return palo;
	}

	public boolean esMismoPaloQue(Carta cartaAComparar) {
		return palo.equals(cartaAComparar.getPalo());
	}

	public boolean esSuperiorA(Carta cartaAComparar) {
		return valorNumericoDe(valor) > valorNumericoDe(cartaAComparar.getValor());
	}

	private int valorNumericoDe(String valorDeUnaCarta) {
		switch (valorDeUnaCarta) {
		case "J":
			return 11;
		case "Q":
			return 12;
		case "K":
			return 13;
		case "A":
			return 14;
		}
		return Integer.valueOf(valorDeUnaCarta);
	}

	public boolean esMismoValorQue(Carta unaCarta) {
		return valor.equals(unaCarta.getValor());
	}
}
