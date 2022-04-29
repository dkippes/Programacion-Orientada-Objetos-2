package interfaces.clases.la.caja.del.mercado2;

public abstract class Producto {
	private double precio;
	private int stock;
	
	public Producto(double precio, int stock) {
		this.precio = precio;
		this.stock = stock;
	}
	
	public boolean hasStock() {
		return this.stock > 0;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void reducirStock() {
		this.stock--;
	}
}
