package test.testdoubles.jugadasdepoquer;

public class Poker implements TipoJugada {
	@Override
	public boolean esMejorQue(TipoJugada tipo) {
		return true;
	}

	@Override
	public boolean equals(Object o) {
		return getClass() == o.getClass();
	}
}
