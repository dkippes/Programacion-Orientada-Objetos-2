package test.testdoubles.jugadasdepoquer;

public class Nada implements TipoJugada {
	@Override
	public boolean esMejorQue(TipoJugada tipo) {
		return false;
	}
	
	@Override
	public String toString() {
		return "Nada";
	}
	
	@Override
	public boolean equals(Object o) {
		return getClass() == o.getClass();
	}
}
