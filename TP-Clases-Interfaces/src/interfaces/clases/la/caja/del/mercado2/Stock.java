package interfaces.clases.la.caja.del.mercado2;

public class Stock {
	private int stock;
	
	public Stock(int stock) {
		this.stock = stock;
	}
	
	public void reducirStockEn1() {
		this.stock -= 1;
	}
	
	public boolean hasStock() {
		return this.stock > 0;
	}
}
