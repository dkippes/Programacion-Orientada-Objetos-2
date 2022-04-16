package supermercado.ejercicio3;

public class IngresoHorasExtras extends Ingreso {
	private int cantidadHorasExtras;
	
	public IngresoHorasExtras(String mes, String concepto, double monto, int cantidadHorasExtras) {
		super(mes, concepto, monto);
		this.cantidadHorasExtras = cantidadHorasExtras;
	}
}
