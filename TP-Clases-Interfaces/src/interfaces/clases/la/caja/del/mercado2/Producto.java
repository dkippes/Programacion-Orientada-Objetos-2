package interfaces.clases.la.caja.del.mercado2;

import interfaces.clases.la.caja.del.mercado2.Stock;

public abstract class Producto {
	protected double precio;
	protected int id;
	protected Stock stock;
	
	public Producto(double precio, int id, Stock stock) {
		this.precio = precio;
		this.id = id;
		this.stock = stock;
	}
	
	public Stock getStock() {
		return this.stock;
	}
	
	public abstract double getPrecio();
}
