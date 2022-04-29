package interfaces.clases.la.caja.del.mercado2;

public class ProductoCooperativas extends Producto {
	public ProductoCooperativas(double precio, int stock) {
		super(aplicarIVA(precio), stock);
	}
	
	private static double aplicarIVA(double precio) {
		return precio - (precio * 0.1);
	}
}
