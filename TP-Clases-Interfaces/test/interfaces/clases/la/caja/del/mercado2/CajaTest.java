package interfaces.clases.la.caja.del.mercado2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.List;

public class CajaTest {

	Caja caja;
	Factura factura;
	Factura factura2;
	AgenciaRecaudadora agencia;

	@BeforeEach
	void setUp() {
		caja = new Caja(new Cliente("Diego"));
		agencia = new AgenciaRecaudadora();
		caja.setAgencia(agencia);
		factura = new Impuesto(1000);
		factura2 = new Servicio(10, 20);
	}
	
	@Test
	@DisplayName("Registra un impuesto a la agencia")
	void testRegistrandoUnImpuesto() {
		agencia.registrarPago(factura);
		assertEquals(agencia.getPagos(), List.of(1000D));
	}
	
	@Test
	@DisplayName("Registra un servicio a la agencia")
	void testRegistrandoUnServicio() {
		agencia.registrarPago(factura2);
		assertEquals(agencia.getPagos(), List.of(200D));
	}
	
	@Test
	@DisplayName("Registra un impuesto y un servicio a la agencia")
	void testRegistrandoUnImpuestoYServicio() {
		agencia.registrarPago(factura);
		agencia.registrarPago(factura2);
		assertEquals(agencia.getPagos(), List.of(1000D, 200D));
	}
}
