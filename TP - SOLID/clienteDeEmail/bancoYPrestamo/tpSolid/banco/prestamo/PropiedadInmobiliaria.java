package tpSolid.banco.prestamo;

public class PropiedadInmobiliaria {
	private String descripcion;
	private String direccion;
	private int valor;
	
	public PropiedadInmobiliaria(String descripcion, String direccion, int valor) {
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}	
}
