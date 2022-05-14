package test.testdoubles.jugadasdepoquer;

public class Color implements TipoJugada {
	@Override
	public boolean esMejorQue(TipoJugada tipo) {
		return !tipo.equals(new Poker());
	}
	
	@Override
	public boolean equals(Object o) {
		return getClass() == o.getClass();
	}
}
