package supermercado.ejercicio1;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado) {
		super(nombre, precio, precioCuidado);
	}

	@Override
	public Double getPrecio() {
		return super.getPrecio() * 0.9;
	}

}
