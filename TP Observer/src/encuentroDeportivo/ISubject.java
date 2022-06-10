package encuentroDeportivo;

public interface ISubject {
	public void suscribir(IObserver observer, String deporte);
	public void desuscribirse(IObserver observer, String deporte);
	public void notificar(Partido partido);
}
