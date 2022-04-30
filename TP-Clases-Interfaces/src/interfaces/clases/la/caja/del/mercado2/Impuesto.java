package interfaces.clases.la.caja.del.mercado2;

public class Impuesto extends Factura {
	private int tasaServicio;
	
	public Impuesto(int tasaServicio) {
		this.tasaServicio = tasaServicio;
	}

	@Override
	public int montoAPagar() {
		return tasaServicio;
	}
	
}
