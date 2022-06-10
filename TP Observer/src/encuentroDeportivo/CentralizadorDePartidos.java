package encuentroDeportivo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CentralizadorDePartidos implements ISubject {
	private List<Partido> partidos;
	private Map<String, List<IObserver>> observadores;
	
	public CentralizadorDePartidos() {
		this.observadores = new HashMap<>();
		this.partidos = new ArrayList<>();
	}
	
	public void cargarPartido(Partido partido) {
		this.partidos.add(partido);
		notificar(partido);
	}

	@Override
	public void suscribir(IObserver observer, String deporte) {
		if(observadores.containsKey(deporte)) {
			List<IObserver> observers = observadores.get(deporte);
			observers.add(observer);
			observadores.put(deporte, observers);
		} else {
			observadores.put(deporte, new ArrayList<>(List.of(observer)));
		}
	}

	@Override
	public void desuscribirse(IObserver observer, String deporte) {
		if(observadores.containsKey(deporte)) {
			List<IObserver> observers = observadores.get(deporte);
			observers.remove(observer);
			observadores.put(deporte, observers);
		}
	}

	@Override
	public void notificar(Partido partido) {
		List<IObserver> observers = observadores.get(partido.getDeporte());
		for (IObserver observer : observers) {
			observer.update(partido);
		}
	}

}

