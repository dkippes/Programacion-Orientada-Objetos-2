package encuentroDeportivo;

import java.util.ArrayList;
import java.util.List;

public class AplicacionMovil implements IObserver {
	private List<Partido> partidosNotificados;
	
	public AplicacionMovil() {
		this.partidosNotificados = new ArrayList<>();
	}

	@Override
	public void update(Partido partido) {
		this.partidosNotificados.add(partido);
	}
	
	public List<Partido> getPartidosNotificados() {
		return partidosNotificados;
	}
}
