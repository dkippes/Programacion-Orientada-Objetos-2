package ar.com.unq.po2.tp3.ejercicio9;

import ar.com.unq.po2.tp3.ejercicio8.Point;

public class Rectangulo {
	private Point point1;
	private Point point2;

	public Rectangulo(Point point1, Point point2) {
		assert !point1.equals(point2);
		this.point1 = point1;
		this.point2 = point2;
	}

	public Point getPoint1() {
		return this.point1;
	}

	public Point getPoint2() {
		return this.point2;
	}

	public Integer calculateAltura() {
		return Math.abs(this.point1.getY() - this.point2.getY());
	}

	public Integer calculateBase() {
		return Math.abs(this.point1.getX() - this.point2.getX());
	}

	public Integer calculateArea() {
		return this.calculateBase() * this.calculateAltura();
	}

	public Integer calculatePerimetro() {
		return 2 * (this.calculateBase() + this.calculateAltura());
	}

	public String getPosition() {
		boolean vertical = this.calculateAltura() > this.calculateBase();
		return vertical ? "vertical" : "horizontal";
	}
}
