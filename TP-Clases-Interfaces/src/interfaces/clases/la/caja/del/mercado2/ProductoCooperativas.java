package interfaces.clases.la.caja.del.mercado2;

import interfaces.clases.la.caja.del.mercado2.CalcularDescuento;
import interfaces.clases.la.caja.del.mercado2.Stock;

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
