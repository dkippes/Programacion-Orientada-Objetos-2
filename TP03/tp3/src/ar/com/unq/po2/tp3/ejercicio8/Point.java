package ar.com.unq.po2.tp3.ejercicio8;

import java.util.Objects;

public class Point {
	private Integer x = 0;
	private Integer y = 0;
	
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}
	
	
}
