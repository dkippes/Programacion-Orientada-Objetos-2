package ejemploObserver;

import java.util.ArrayList;
import java.util.List;

public class SujetoMedidorDeTemperatura implements ISujeto {
	private List<IObservador> observadores;
	private int temperatura;
	
	public SujetoMedidorDeTemperatura() {
		this.observadores = new ArrayList<>();
	}
	
	public void cambiarTemperatura(int temperatura) {
		this.temperatura = temperatura;
		notificar();
	}

	@Override
	public void suscribir(IObservador observador) {
		observadores.add(observador);
	}

	@Override
	public void desuscribir(IObservador observador) {
		observadores.remove(observador);		
	}

	@Override
	public void notificar() {
		observadores.forEach(observador -> observador.actualizar());
	}
	
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	public int getTemperatura() {
		return temperatura;
	}
}
