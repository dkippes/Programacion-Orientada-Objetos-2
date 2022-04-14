package supermercado;

import java.util.function.BooleanSupplier;

public class Producto {
	private String nombre;
	private int precio;
	private boolean precioCuidado = false;

	public Producto(String string, double d) {
	}

	public Producto(String string, double d, boolean b) {
	}

	public Object getNombre() {
		return null;
	}

	public Double getPrecio() {
		return null;
	}

	public BooleanSupplier esPrecioCuidado() {
		return null;
	}

	public void aumentarPrecio(double d) {
	}
}
