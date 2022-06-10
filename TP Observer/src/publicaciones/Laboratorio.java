package publicaciones;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio implements IObserver {
	private List<String> notificaciones;
	
	public Laboratorio() {
		this.notificaciones = new ArrayList();
	}
	
	@Override
	public void update(String notificacion) {
		this.notificaciones.add(notificacion);
	}
	
	public List<String> getNotificaciones() {
		return notificaciones;
	}
}
