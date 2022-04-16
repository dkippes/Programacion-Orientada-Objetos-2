package supermercado.ejercicio2;

public class ProductoPrimeraNecesidad extends Producto {
	private double descuento;

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado, double descuento) throws Exception {
		super(nombre, aplicarDescuento(precio, descuento), precioCuidado);
		this.descuento = descuento;
	}

	@Override
	public Double getPrecio() {
		return super.getPrecio();
	}
	
	private static double aplicarDescuento(double precio, double descuento) throws Exception {
		if (descuento == 0.0) {
			return precio;
		}
		if (descuento > 100) {
			throw new Exception("El descuento no puede ser mayor al 100% del producto");
		}
		return precio - ((precio * descuento) / 100);
	}

}
