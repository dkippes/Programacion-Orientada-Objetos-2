package encuentroDeportivo;

import java.util.ArrayList;
import java.util.List;

public class ServidorDeportivo implements IObserver {
	private List<Partido> intereses;
	
	public ServidorDeportivo() {
		this.intereses = new ArrayList<>();
	}

	@Override
	public void update(Partido partido) {
		this.intereses.add(partido);
	}

}
