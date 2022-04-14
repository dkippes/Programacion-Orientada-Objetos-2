package ar.com.unq.po2.tp3.ejercicio9;

import ar.com.unq.po2.tp3.ejercicio8.Point;

public class Cuadrado {
	private Point point;

	public Cuadrado(Point point) {
		assert point.getX() == point.getY();
		this.point = point;
	}
	
	public Point getPoint() {
		return this.point;
	}
	
	public Integer calculateLado() {
		return Math.abs(this.point.getX());
	}

	public Integer calculateArea() {
		return (int) Math.pow(this.calculateLado(), 2);
	}

	public Integer calculatePerimetro() {
		return 4 * this.calculateLado();
	}
}
