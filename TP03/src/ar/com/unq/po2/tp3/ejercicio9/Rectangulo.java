package ar.com.unq.po2.tp3.ejercicio9;

import ar.com.unq.po2.tp3.ejercicio8.Point;

public class Rectangulo extends FiguraGeometrica {
	public Rectangulo(Point point1, Point point2) {
		assert esRectangulo(point1, point2);
		super.setPoint1(point1);
		super.setPoint2(point2);
	}

	public Integer calculateAltura() {
		return Math.abs(this.getPoint1().getY() - this.getPoint2().getY());
	}

	public Integer calculateBase() {
		return Math.abs(this.getPoint1().getX() - this.getPoint2().getX());
	}

	@Override
	public Integer calculateArea() {
		return this.calculateBase() * this.calculateAltura();
	}

	@Override
	public Integer calculatePerimetro() {
		return 2 * (this.calculateBase() + this.calculateAltura());
	}

	public String getPosition() {
		boolean vertical = this.calculateAltura() > this.calculateBase();
		return vertical ? "vertical" : "horizontal";
	}
	
	public static boolean esRectangulo(Point point1, Point point2) {
		int ladoX = Math.abs(Math.abs(point1.getX()) - Math.abs(point2.getX()));
		int ladoY = Math.abs(Math.abs(point1.getY()) - Math.abs(point2.getY()));
		return !point1.equals(point2) && ladoX != ladoY;
	}
}
