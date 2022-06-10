package publicaciones;

import java.util.Set;

public interface ISubject {
	public void suscribir(IObserver observer, String temasDeInteres);
	public void desuscribirse(IObserver observer, String temaInteres);
	public void notificar(Articulo articulo);
}
