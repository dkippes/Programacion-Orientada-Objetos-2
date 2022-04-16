package supermercado.ejercicio2;

public class Producto {
	private String nombre;
	private double precio;
	private boolean precioCuidado = false;

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public Producto(String nombre, double precio, boolean precioCuidado) {
		this(nombre, precio);
		this.precioCuidado = precioCuidado;
	}

	public boolean esPrecioCuidado() {
		return precioCuidado;
	}

	public void aumentarPrecio(double precioAumentar) {
		this.precio += precioAumentar;
	}

	public Double getPrecio() {
		return precio;
	}

	public String getNombre() {
		return nombre;
	}
}
