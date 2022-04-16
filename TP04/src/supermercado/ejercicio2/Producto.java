package supermercado.ejercicio2;

public class Producto {
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado = false;

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this(nombre, precio);
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
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
