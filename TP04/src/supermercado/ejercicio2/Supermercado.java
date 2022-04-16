package supermercado.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	public Supermercado() {
		this.productos = new ArrayList<>();
	}

	public Supermercado(String nombre, String direccion) {
		this();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public Integer getCantidadDeProductos() {
		return this.productos.size();
	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}

	public Double getPrecioTotal() {
		return this.productos
				.stream()
				.mapToDouble(p -> p.getPrecio())
				.reduce(0D, (subtotal, element) -> subtotal + element);
	}
}
