package test.testdoubles.jugadasdepoquer;

import java.util.List;

public class Jugada {
	private TipoJugada tipoJugada;
	private List<Carta> cartas;
	
	public Jugada(TipoJugada tipoJugada, List<Carta> cartas) {
		this.cartas = cartas;
		this.tipoJugada = tipoJugada;
	}
	
	public boolean soyGanadora(Jugada jugada) {
		if (this.tipoJugada.equals(jugada.getTipo())) {
			// TODO: Logica de comparar cartas
		}
		return this.tipoJugada.esMejorQue(jugada.getTipo());
	}

	public TipoJugada getTipo() {
		return tipoJugada;
	}
	
	public void setTipoJugada(TipoJugada tipoJugada) {
		this.tipoJugada = tipoJugada;
	}
}
