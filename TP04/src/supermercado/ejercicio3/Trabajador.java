package supermercado.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresos;
	
	public Trabajador() {
		this.ingresos = new ArrayList<>();
	}
	
	public Trabajador addIngreso(Ingreso ingreso) {
		this.ingresos.add(ingreso);
		return this;
	}
	
	public double getTotalPercibido() {
		return this.ingresos
				.stream()
				.mapToDouble(i -> i.getMonto())
				.reduce(0d, (subtotal, elemento) -> subtotal + elemento);
	}
	
	public double getMontoImponible() {
		return this.ingresos
				.stream()
				.filter(i -> i instanceof IngresoHorasExtras)
				.mapToDouble(i -> i.getMonto())
				.reduce(0d, (subtotal, elemento) -> subtotal + elemento);
	}
	
	public double getImpuestoAPagar() {
		return (this.getMontoImponible() * 2) / 100;
	}
}
