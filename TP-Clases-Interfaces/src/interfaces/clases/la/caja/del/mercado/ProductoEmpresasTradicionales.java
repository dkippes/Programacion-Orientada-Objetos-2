package interfaces.clases.la.caja.del.mercado;

public class ProductoEmpresasTradicionales extends Producto {
	public ProductoEmpresasTradicionales(double precio, int id, Stock stock) {
		super(precio, id, stock);
	}

	@Override
	public double getPrecio() {
		return precio;
	}
}
