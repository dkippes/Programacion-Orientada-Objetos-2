package interfaces.clases.la.caja.del.mercado;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	private Cliente cliente;
	private Double monto;
	private List<Producto> productos;
	
	public Caja(Cliente cliente) {
		this.cliente = cliente;
		this.productos = new ArrayList<>();
		this.monto = 0D;
	}
	
	public Caja registrarProducto(Producto producto) {
		if (producto.getStock().hasStock()) {
			this.productos.add(producto);
			producto.getStock().reducirStockEn1();
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
