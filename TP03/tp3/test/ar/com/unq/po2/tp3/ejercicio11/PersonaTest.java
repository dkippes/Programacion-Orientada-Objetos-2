package ar.com.unq.po2.tp3.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {

	Persona persona;
	EquipoDeTrabajo equipoDeTrabajo;

	@BeforeEach
	void setUp() {
		persona = new Persona("Diego", "Kippes", 26);
		equipoDeTrabajo = new EquipoDeTrabajo("Equipo cool");
	}

	@Test
	void shouldBeAPersona() {
		assertEquals(persona.getNombre(), "Diego");
		assertEquals(persona.getApellido(), "Kippes");
		assertEquals(persona.getEdad(), 26);
	}

	@Test
	void shouldCalculatePromedioEdad() {
		Persona persona1 = new Persona("Juanjo", "Talarga", 6);
		Persona persona2 = new Persona("Laura", "Gimenez", 15);
		Persona persona3 = new Persona("Ruben", "Roldan", 58);
		Persona persona4 = new Persona("Enrique", "Enquistes", 30);

		equipoDeTrabajo.addIntegrante(persona)
				.addIntegrante(persona1)
				.addIntegrante(persona2)
				.addIntegrante(persona3)
				.addIntegrante(persona4);

		assertEquals(equipoDeTrabajo.getNombre(), "Equipo cool");
		assertEquals(equipoDeTrabajo.calcularPromedioEdad(), 27);
	}
}
