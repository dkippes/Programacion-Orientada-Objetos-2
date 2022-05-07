package interfaces.clases.la.caja.del.mercado2;

public class Impuesto implements Factura {
	private int tasaServicio;
	
	public Impuesto(int tasaServicio) {
		this.tasaServicio = tasaServicio;
	}

	@Override
	public double montoAPagar() {
		return this.tasaServicio;
	}
}
