package ar.com.unq.po2.tp3.ejercicio10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
	
	Persona diego;

	@BeforeEach
	void setUp() {
		Date date = new Calendar.Builder()
				.setDate(1995, 10, 5)
				.build()
				.getTime();
		diego = new Persona("Diego", date);
	}
	
	@Test
	void shouldBeAPersona() {
		Date expectedDate = new Calendar.Builder()
				.setDate(1995, 10, 5)
				.build()
				.getTime();;
		assertEquals(diego.getNombre(), "Diego");
		assertEquals(diego.getFechaNacimiento(), expectedDate);
	}
	
	@Test
	void shouldCalculateEdad() {
		assertEquals(diego.calculateEdad(), 27);
	}
	
	@Test
	void shouldBeMenorQue() {
		Date date = new Calendar.Builder()
				.setDate(2000, 10, 5)
				.build()
				.getTime();
		Persona rodrigo = new Persona("Rodrigo", date);
		assertEquals(diego.menorQue(rodrigo), true);
	}
}
