package ar.com.unq.po2.tp3.ejercicio9;

import ar.com.unq.po2.tp3.ejercicio8.Point;

public class Cuadrado extends FiguraGeometrica {
	public Cuadrado(Point point1, Point point2) {
		// x = y
		assert point1.getX() == point2.getX();
		assert point1.getY() == point2.getY();
		this.setPoint1(point1);
		this.setPoint2(point2);
	}
	
	public Integer calculateLado() {
		return Math.abs(Math.abs(super.getPoint1().getX()) - Math.abs(super.getPoint2().getX()));
	}

	@Override
	public Integer calculateArea() {
		return (int) Math.pow(this.calculateLado(), 2);
	}

	@Override
	public Integer calculatePerimetro() {
		return 4 * this.calculateLado();
	}
	
	public static boolean esCuadrado() {
		return null;
	}
}

