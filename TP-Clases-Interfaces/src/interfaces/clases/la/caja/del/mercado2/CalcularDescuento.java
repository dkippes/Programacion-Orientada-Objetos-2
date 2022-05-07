package interfaces.clases.la.caja.del.mercado2;

public class CalcularDescuento {
	private double descuento;
	
	public CalcularDescuento(double descuento) {
		this.descuento = descuento;
	}

	public int aplicarDescuento(double precio) {
		return (int) (precio * descuento);
	}

}
