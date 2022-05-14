package test.testdoubles.jugadasdepoquer;

public class Trio implements TipoJugada {
	@Override
	public boolean esMejorQue(TipoJugada tipo) {
		return !tipo.equals(new Poker()) && !tipo.equals(new Color());
	}
	
	@Override
	public String toString() {
		return "Trio";
	}
	
	@Override
	public boolean equals(Object o) {
		return getClass() == o.getClass();
	}
}
