package tpSolid.banco.prestamo;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private int sueldoNetoMensual;
	private int sueldoNetoAnual;

	public Cliente(String nombre, String apellido, String direccion, int edad, int sueldoNetoMensual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.sueldoNetoAnual = sueldoNetoMensual * 12;
	}

	public int getEdad() {
		return edad;
	}

	public int getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public int getSueldoNetoAnual() {
		return sueldoNetoAnual;
	}

	public void setSueldoNetoAnual(int sueldoNetoAnual) {
		this.sueldoNetoAnual = sueldoNetoAnual;
	}

	public void solicitarCredito(Banco banco, Solicitud solicitud) {
		banco.registrarSolicitudCredito(solicitud, this);
	}

}
