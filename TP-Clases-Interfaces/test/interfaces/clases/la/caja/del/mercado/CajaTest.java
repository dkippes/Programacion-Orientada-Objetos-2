package interfaces.clases.la.caja.del.mercado;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CajaTest {
	
	Caja caja;
	Producto producto1;
	Producto producto2;
	Producto producto3;

	@BeforeEach
	void setUp() {
		caja = new Caja("Diego");
		producto1 = new ProductoEmpresasTradicionales(100D, 10);
		producto2 = new ProductoCooperativas(100D, 1);
		producto3 = new ProductoCooperativas(1000000D, 0);
	}
	
	@Test
	@DisplayName("Crea una caja sin productos")
	void testCreaUnaCaja() {
		assertEquals(caja.getCliente().getNombre(), "Diego");
		assertEquals(caja.getProductos().size(), 0);
	}
	
	@Test
	@DisplayName("Crea una caja con 1 producto")
	void testCajaConUnProducto() {
		caja.registrarProducto(producto1);
		assertEquals(caja.getProductos().size(), 1);
		assertEquals(caja.getMonto(), 100);
	}
	
	@Test
	@DisplayName("Crea una caja con 2 producto")
	void testCajaConDpsProductos() {
		caja.registrarProducto(producto1);
		caja.registrarProducto(producto2);
		assertEquals(caja.getProductos().size(), 2);
		assertEquals(caja.getMonto(), 190);
	}
	
	@Test
	@DisplayName("Crea una caja con 2 producto, y no agrega al que no tiene stock")
	void testCajaConDpsProductosYUnoSinStock() {
		caja.registrarProducto(producto1);
		caja.registrarProducto(producto2);
		caja.registrarProducto(producto3);
		assertEquals(caja.getProductos().size(), 2);
		assertEquals(caja.getMonto(), 190);
	}
	
	@Test
	@DisplayName("Crea una caja con 2 producto, y no agrega al que no tiene stock")
	void testCajaConDosProductosIgualesYElSegundoSinStock() {
		caja.registrarProducto(producto2);
		caja.registrarProducto(producto2);
		assertEquals(caja.getProductos().size(), 1);
		assertEquals(caja.getMonto(), 90);
	}
}
