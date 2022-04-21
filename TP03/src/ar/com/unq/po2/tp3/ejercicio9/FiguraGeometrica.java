package ar.com.unq.po2.tp3.ejercicio9;

import ar.com.unq.po2.tp3.ejercicio8.Point;

public abstract class FiguraGeometrica {
	private Point point1;
	private Point point2;
	
	public Point getPoint1() {
		return this.point1;
	}
	
	public Point getPoint2() {
		return this.point2;
	}
	
	public void setPoint1(Point point) {
		this.point1 = point;
	}
	
	public void setPoint2(Point point) {
		this.point2 = point;
	}

	public abstract Integer calculateArea();

	public abstract Integer calculatePerimetro();
}
