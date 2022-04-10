package ar.com.unq.po2.tp3.ejercicio8;

public class Point {
	private int x;
	private int y;
	
	public Point() { // new Point()
	}
	
	public Point(int x, int y) { //new Point(3, 9)
		this.x = x;
		this.y = y;
	}
	
	public void moverAPosicion(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void sumarPuntos(Point point) {
		this.x += point.getX();
		this.y += point.getY();
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}
