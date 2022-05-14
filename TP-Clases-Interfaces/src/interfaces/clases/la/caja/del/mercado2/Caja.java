package interfaces.clases.la.caja.del.mercado2;

import java.util.ArrayList;
import java.util.List;

import interfaces.clases.la.caja.del.mercado2.Cliente;
import interfaces.clases.la.caja.del.mercado2.Producto;

public class Caja {
	private Cliente cliente;
	private Double monto;
	private List<Producto> productos;
	private Agencia agencia;
	
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
	
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public void registrarPagoEnAgencia(Factura factura) {
		this.agencia.registrarPago(factura);
	}
}
