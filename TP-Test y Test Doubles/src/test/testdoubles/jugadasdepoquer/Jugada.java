package test.testdoubles.jugadasdepoquer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Jugada {
	private TipoJugada tipoJugada;
	private List<Carta> cartas;
	
	public Jugada(TipoJugada tipoJugada, List<Carta> cartas) {
		this.cartas = cartas;
		this.tipoJugada = tipoJugada;
	}
	
	public boolean soyGanadora(Jugada jugada) {
		if (this.tipoJugada.equals(jugada.getTipo())) {
			return valorTotalDeLaMano(this.cartas) >= valorTotalDeLaMano(jugada.getCartas());
		}
		return this.tipoJugada.esMejorQue(jugada.getTipo());
	}
	
	public int valorTotalDeLaMano(List<Carta> cartas) {
		int a = this.cartas.get(0).valorNumerico();
		int b = this.cartas.get(1).valorNumerico();
		int c = this.cartas.get(2).valorNumerico();
		int d = this.cartas.get(3).valorNumerico();
		int e = this.cartas.get(4).valorNumerico();
		List<Integer> i = this.cartas.stream()
				.map(carta -> carta.valorNumerico())
				.collect(Collectors.toList());
		int ea = i.stream().reduce(0, (sub,el) -> sub+el);
		
		return this.cartas.stream()
				.mapToInt(carta -> carta.valorNumerico())
				.sum();
	}

	public TipoJugada getTipo() {
		return tipoJugada;
	}
	
	public List<Carta> getCartas() {
		return cartas;
	}
	
	public void setTipoJugada(TipoJugada tipoJugada) {
		this.tipoJugada = tipoJugada;
	}
}
