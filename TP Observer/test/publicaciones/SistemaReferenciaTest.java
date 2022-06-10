package publicaciones;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaReferenciaTest {
	private Articulo articulo;
	private Laboratorio laboratorio;
	private SistemaReferencia sistemaReferencia;

	@BeforeEach
	void setUp() {
		articulo = mock(Articulo.class);
		sistemaReferencia = new SistemaReferencia();
		laboratorio = mock(Laboratorio.class);
	}
	
	@Test
	void testSistemaSeSuscribeElPrimerLaboratorio() {
		when(articulo.getTipo()).thenReturn("Programacion");
		when(articulo.getTitulo()).thenReturn("Programacion con objetos 2");
		sistemaReferencia.suscribir(laboratorio, "Programacion");
		sistemaReferencia.agregarArticulo(articulo);
		verify(laboratorio, times(1)).update(articulo.toString());;
	}
	
	@Test
	void testSistemaSeSuscribeElSegundoLaboratorio() {
		Laboratorio laboratorio2 = mock(Laboratorio.class);
		when(articulo.getTipo()).thenReturn("Programacion");
		when(articulo.getTitulo()).thenReturn("Programacion con objetos 2");
		sistemaReferencia.suscribir(laboratorio, "Programacion");
		sistemaReferencia.suscribir(laboratorio2, "Programacion");
		sistemaReferencia.agregarArticulo(articulo);
		verify(laboratorio, times(1)).update(articulo.toString());;
		verify(laboratorio2, times(1)).update(articulo.toString());;
	}
	
	@Test
	void testSistemaSeDesuscribeElLaboratorio() {
		when(articulo.getTipo()).thenReturn("Programacion");
		when(articulo.getTitulo()).thenReturn("Programacion con objetos 2");
		sistemaReferencia.suscribir(laboratorio, "Programacion");
		sistemaReferencia.agregarArticulo(articulo);
		sistemaReferencia.desuscribirse(laboratorio, "Programacion");
		sistemaReferencia.agregarArticulo(articulo);
		verify(laboratorio, times(1)).update(articulo.toString());;
	}
}
