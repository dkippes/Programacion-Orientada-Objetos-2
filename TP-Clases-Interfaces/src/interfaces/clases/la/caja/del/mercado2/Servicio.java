package interfaces.clases.la.caja.del.mercado2;

public class Servicio extends Factura {
	private int costoUnidad;
	private int cantidadUnidades;
	
	public Servicio(int costoUnidad, int cantidadUnidades) {
		this.costoUnidad = costoUnidad;
		this.cantidadUnidades = cantidadUnidades;
	}
	
	@Override
	public int montoAPagar() {
		return costoUnidad * cantidadUnidades;
	}
}
