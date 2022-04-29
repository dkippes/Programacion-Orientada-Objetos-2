package interfaces.clases.la.caja.del.mercado;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	private Cliente cliente;
	private Double monto;
	private List<Producto> productos;
	
	public Caja(String nombre) {
		this.cliente = new Cliente(nombre);
		this.productos = new ArrayList<>();
		this.monto = 0D;
	}
	
	public Caja registrarProducto(Producto producto) {
		if (producto.hasStock()) {
			this.productos.add(producto);
			producto.reducirStock();
			this.monto += producto.getPrecio();
		}
		return this;
	}
	
	public double getMonto() {
		return this.monto;
	}
	
	public List<Producto> getProductos() {
		return this.productos;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
}
