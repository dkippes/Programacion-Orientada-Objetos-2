package ejemploObserver;

public class MainTest {
	public static void main(String[] args) {
		SujetoMedidorDeTemperatura sujetoConcreto = new SujetoMedidorDeTemperatura();
		IObservador observador1 = new ObservadorBomberos(sujetoConcreto);
		IObservador observador2 = new ObservadorPolicia(sujetoConcreto);
		sujetoConcreto.suscribir(observador1);
		sujetoConcreto.suscribir(observador2);
		sujetoConcreto.cambiarTemperatura(15);
	}
}
