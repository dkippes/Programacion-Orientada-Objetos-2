package supermercado.ejercicio2;

import supermercado.ejercicio2.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad cereales;
	private ProductoPrimeraNecesidad tomate;

	@BeforeEach
	public void setUp() throws Exception {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 10.0);
		cereales = new ProductoPrimeraNecesidad("Cereales", 10d, false, 0.0);
		tomate = new ProductoPrimeraNecesidad("Tomate", 10d, false, 100.0);
	}

	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.2), leche.getPrecio());
	}
	
	@Test
	public void testCalcularPrecioConDescuento0() {
		assertEquals(new Double(10), cereales.getPrecio());
	}
	
	@Test
	public void testCalcularPrecioConDescuento100() {
		assertEquals(new Double(0), tomate.getPrecio());
	}
	
	@Test
	public void testCalcularPrecioConDescuentoMasDe100() {
		assertThrows(Exception.class, () -> new ProductoPrimeraNecesidad("Tomate", 150d, false, 101.0));
	}
}
