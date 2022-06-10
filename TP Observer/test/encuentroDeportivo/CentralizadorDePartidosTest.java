package encuentroDeportivo;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import encuentroDeportivo.AplicacionMovil;
import encuentroDeportivo.CentralizadorDePartidos;
import encuentroDeportivo.Partido;
import encuentroDeportivo.ServidorDeportivo;

public class CentralizadorDePartidosTest {
	CentralizadorDePartidos centralizadorDePartidos;
	AplicacionMovil aplicacionMovil;
	Partido partido;
	ServidorDeportivo servidorDeportivo;

	@BeforeEach
	void setUp() {
		centralizadorDePartidos = new CentralizadorDePartidos();
		aplicacionMovil = mock(AplicacionMovil.class);
		servidorDeportivo = mock(ServidorDeportivo.class);
		partido = mock(Partido.class);
	}
	
	@Test
	void testNotificacionAAplicacionMovil() {
		centralizadorDePartidos.suscribir(aplicacionMovil, "Futbol");
		when(partido.getDeporte()).thenReturn("Futbol");
		centralizadorDePartidos.cargarPartido(partido);
		verify(aplicacionMovil, atLeastOnce()).update(partido);
	}
	
	@Test
	void testNotificacionAServidor() {
		centralizadorDePartidos.suscribir(servidorDeportivo, "Futbol");
		when(partido.getDeporte()).thenReturn("Futbol");
		centralizadorDePartidos.cargarPartido(partido);
		verify(servidorDeportivo, atLeastOnce()).update(partido);
	}
	
	@Test
	void testNotificacionAServidorYDesuscripcionDeAplicacionMovil() {
		centralizadorDePartidos.suscribir(servidorDeportivo, "Futbol");
		centralizadorDePartidos.suscribir(aplicacionMovil, "Futbol");
		centralizadorDePartidos.desuscribirse(aplicacionMovil, "Futbol");
		when(partido.getDeporte()).thenReturn("Futbol");
		centralizadorDePartidos.cargarPartido(partido);
		verify(servidorDeportivo, atLeastOnce()).update(partido);
		verify(aplicacionMovil, times(0)).update(partido);
	}
	
	@Test
	void testNotificacion2PartidosAServidor() {
		Partido partido2 = mock(Partido.class);
		centralizadorDePartidos.suscribir(servidorDeportivo, "Futbol");
		centralizadorDePartidos.suscribir(servidorDeportivo, "Basket");
		when(partido.getDeporte()).thenReturn("Futbol");
		when(partido2.getDeporte()).thenReturn("Basket");
		centralizadorDePartidos.cargarPartido(partido);
		centralizadorDePartidos.cargarPartido(partido2);
		verify(servidorDeportivo, times(2)).update(any());
	}
}
