package interfaces.clases.la.caja.del.mercado2;

import interfaces.clases.la.caja.del.mercado2.Stock;

public class ProductoEmpresasTradicionales extends Producto {
	public ProductoEmpresasTradicionales(double precio, int id, Stock stock) {
		super(precio, id, stock);
	}

	@Override
	public double getPrecio() {
		return precio;
	}
}
