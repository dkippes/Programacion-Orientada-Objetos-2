package ar.com.unq.po2.tp3.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	private String nombre;
	private List<Persona> integrantes;
	
	public EquipoDeTrabajo() {
		this.integrantes = new ArrayList<>();
	}
	
	public EquipoDeTrabajo(String nombre) {
		this();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public int calcularPromedioEdad() {
		int totalEdad = this.integrantes
				.stream()
				.mapToInt(i -> i.getEdad())
				.sum();
		return totalEdad / (this.integrantes.size());
	}
	
	public EquipoDeTrabajo addIntegrante(Persona persona) {
		this.integrantes.add(persona);
		return this;
	}
	
}
