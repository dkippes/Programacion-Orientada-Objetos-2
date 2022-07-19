package ejemploObserver;

public class ObservadorPolicia implements IObservador {
private SujetoMedidorDeTemperatura sujetoAObservar;
	
	public ObservadorPolicia(SujetoMedidorDeTemperatura sujectoAObservar) {
		this.sujetoAObservar = sujectoAObservar;
	}

	@Override
	public void actualizar() {
		System.out.println("Se notifico a los policias que cambio la temperatura a: " 
				+ sujetoAObservar.getTemperatura());
	}
}
