package ar.com.unq.po2.tp3.ejercicio10;

import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Persona {
	private String nombre;
	private Date fechaNacimiento;
	
	public Persona(String nombre, Date fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public int calculateEdad() {
		Date today = new Date();
		return today.getYear() - this.fechaNacimiento.getYear();
	}
	
	public boolean menorQue(Persona persona) {
		return this.calculateEdad() > persona.calculateEdad();
	}
	
}
