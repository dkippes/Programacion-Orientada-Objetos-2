package interfaces.clases.la.caja.del.mercado2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CajaTest {

	Caja caja;
	Factura factura;
	Factura factura2;

	@BeforeEach
	void setUp() {
		caja = new Caja("Diego");
		factura = new Impuesto(1000);
		factura2 = new Servicio(10, 20);
	}
	
	@Test
	@DisplayName("Crea una caja sin facturas")
	void testCreaUnaCaja() {
		assertEquals(caja.getCliente().getNombre(), "Diego");
		assertEquals(caja.getFacturas().size(), 0);
	}
	
	@Test
	@DisplayName("Crea una caja y agrega una factura de impuesto")
	void testCreaUnaCajaYRegistraUnaFacturaImpuesto() {
		assertEquals(caja.getCliente().getNombre(), "Diego");
		caja.registrarPago(factura);
		assertEquals(caja.getFacturas().size(), 1);
		assertEquals(caja.getFacturas().get(0).montoAPagar(), 1000);
	}
	
	@Test
	@DisplayName("Crea una caja y agrega una factura de servicio")
	void testCreaUnaCajaYRegistraUnaFacturaServicio() {
		assertEquals(caja.getCliente().getNombre(), "Diego");
		caja.registrarPago(factura2);
		assertEquals(caja.getFacturas().size(), 1);
		assertEquals(caja.getFacturas().get(0).montoAPagar(), 200);
	}
	
	@Test
	@DisplayName("Crea una caja y agrega una factura de servicio y otra de impuesto")
	void testCreaUnaCajaYRegistraUnaFacturaServicioEImpuesto() {
		assertEquals(caja.getCliente().getNombre(), "Diego");
		caja.registrarPago(factura);
		caja.registrarPago(factura2);
		assertEquals(caja.getFacturas().size(), 2);
		assertEquals(caja.getFacturas()
				.stream()
				.mapToInt(f -> f.montoAPagar())
				.sum()
				, 1200);
	}
}
