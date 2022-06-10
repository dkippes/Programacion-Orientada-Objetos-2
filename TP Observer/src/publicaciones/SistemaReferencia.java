package publicaciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SistemaReferencia implements ISubject {
	private List<Articulo> articulos;
	private Map<String, List<IObserver>> observers;

	public SistemaReferencia() {
		this.articulos = new ArrayList<>();
		this.observers = new HashMap<>();
	}

	@Override
	public void suscribir(IObserver observer, String temasDeInteres) {
		if(this.observers.containsKey(temasDeInteres)) {
			List<IObserver> laboratoriosActuales = this.observers.get(temasDeInteres);
			laboratoriosActuales.add(observer);
			this.observers.put(temasDeInteres, laboratoriosActuales);
		} else {
			this.observers.put(temasDeInteres, new ArrayList(List.of(observer)));
		}
	}

	@Override
	public void desuscribirse(IObserver observer, String temaInteres) {
		if(this.observers.containsKey(temaInteres)) {
			List<IObserver> laboratoriosActuales = this.observers.get(temaInteres);
			laboratoriosActuales.remove(observer);
			this.observers.put(temaInteres, laboratoriosActuales);
		}
	}

	@Override
	public void notificar(Articulo articulo) {
		if(this.observers.containsKey(articulo.getTipo())) {
			List<IObserver> observadoresDelTema = this.observers.get(articulo.getTipo());
			for(IObserver observer : observadoresDelTema) {
				observer.update(articulo.toString());
			}
		}
	}

	public void agregarArticulo(Articulo articulo) {
		this.articulos.add(articulo);
		notificar(articulo);
	}

}
