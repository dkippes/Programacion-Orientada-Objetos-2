package ejemploObserver;

public class ObservadorBomberos implements IObservador {
	private SujetoMedidorDeTemperatura sujetoAObservar;
	
	public ObservadorBomberos(SujetoMedidorDeTemperatura sujectoAObservar) {
		this.sujetoAObservar = sujectoAObservar;
	}

	@Override
	public void actualizar() {
		System.out.println("Se notifico a los bomberos que cambio la temperatura a: " 
				+ sujetoAObservar.getTemperatura());
	}
}
