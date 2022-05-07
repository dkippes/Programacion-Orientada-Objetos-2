package interfaces.clases.la.caja.del.mercado;

public class ProductoCooperativas extends Producto {
	private CalcularDescuento calcularDescuento;
	
	public ProductoCooperativas(double precio, int id, Stock stock, CalcularDescuento calcularDescuento) {
		super(precio, id, stock);
		this.calcularDescuento = calcularDescuento;
	}

	@Override
	public double getPrecio() {
		return precio - calcularDescuento.aplicarDescuento(precio);
	}
}
