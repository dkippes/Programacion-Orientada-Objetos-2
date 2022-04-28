package ar.com.unq.po2.tp3.ejercicio9;

import ar.com.unq.po2.tp3.ejercicio8.Point;

public class Cuadrado extends FiguraGeometrica {
	public Cuadrado(Point point1, Point point2) {
		// x = y
		assert esCuadrado(point1, point2);
		this.setPoint1(point1);
		this.setPoint2(point2);
	}
	
	public Integer calculateLado() {
		return Math.abs(Math.abs(this.getPoint1().getX()) - Math.abs(this.getPoint2().getX()));
	}

	@Override
	public Integer calculateArea() {
		return (int) Math.pow(this.calculateLado(), 2);
	}

	@Override
	public Integer calculatePerimetro() {
		return 4 * this.calculateLado();
	}
	
	public static boolean esCuadrado(Point point1, Point point2) {
		int ladoX = Math.abs(Math.abs(point1.getX()) - Math.abs(point2.getX()));
		int ladoY = Math.abs(Math.abs(point1.getY()) - Math.abs(point2.getY()));
		return !point1.equals(point2) && ladoX == ladoY;
	}
}

