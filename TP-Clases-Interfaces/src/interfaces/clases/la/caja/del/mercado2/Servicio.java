package interfaces.clases.la.caja.del.mercado2;

public class Servicio implements Factura{
	private int costoUnidad;
	private int cantidadUnidadesConsumidas;
	
	public Servicio(int costoUnidad, int cantidadUnidadesConsumidas) {
		this.costoUnidad = costoUnidad;
		this.cantidadUnidadesConsumidas = cantidadUnidadesConsumidas;
	}

	@Override
	public double montoAPagar() {
		return this.costoUnidad * this.cantidadUnidadesConsumidas;
	}
}
