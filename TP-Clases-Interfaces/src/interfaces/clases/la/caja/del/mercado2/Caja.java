package interfaces.clases.la.caja.del.mercado2;

import java.util.ArrayList;
import java.util.List;

public class Caja implements Agencia {
	private Cliente cliente;
	private Double monto;
	private List<Producto> productos;
	private List<Factura> facturas;
	
	public Caja(String nombre) {
		this.cliente = new Cliente(nombre);
		this.productos = new ArrayList<>();
		this.facturas = new ArrayList<>();
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
	
	public List<Factura> getFacturas() {
		return facturas;
	}

	@Override
	public void registrarPago(Factura factura) {
		this.facturas.add(factura);
	}
	
}
