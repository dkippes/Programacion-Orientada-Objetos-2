package ejemploObserver;

public interface ISujeto {
	public void suscribir(IObservador observador);
	public void desuscribir(IObservador observador);
	public void notificar();
}
