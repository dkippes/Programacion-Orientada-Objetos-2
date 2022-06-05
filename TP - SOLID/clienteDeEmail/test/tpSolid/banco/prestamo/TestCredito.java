package tpSolid.banco.prestamo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCredito {
	Banco banco;
	Cliente cliente;
	PropiedadInmobiliaria inmobiliaria;
	Solicitud solicitudCreditoHipotecatio;
	Solicitud solicitudCreditoPersonal;
	
	@BeforeEach
	void setUp() {
		banco = new Banco();
		cliente = new Cliente("Diego", "Kippes", "Direccion", 35, 10000);
		inmobiliaria = new PropiedadInmobiliaria("Grande", "Nueva dir", 15000);
		solicitudCreditoHipotecatio = new SolicitudCreditoHipotecario(5000, 5, cliente, inmobiliaria);
		solicitudCreditoPersonal = new SolicitudCreditoPersonal(5000, 5, cliente);
	}

	@Test
	void testCliente() {
		assertEquals(120000, cliente.getSueldoNetoAnual());
		assertEquals(10000, cliente.getSueldoNetoMensual());
	}
	
	@Test
	void testAgregarCliente() {
		banco.agregarUsuario(cliente);
		assertTrue(banco.getClientes().size() > 0);
	}
	
	@Test
	void testClienteSolicitudHipotecario() {
		banco.agregarUsuario(cliente);
		cliente.solicitarCredito(banco, solicitudCreditoHipotecatio);
		assertEquals(banco.getSolicitudesCreditos().get(0).solicitudCredito(), 1000);
	}
	
	@Test
	void testClienteSolicitudPersonal() {
		banco.agregarUsuario(cliente);
		cliente.solicitarCredito(banco, solicitudCreditoPersonal);
		assertEquals(banco.getSolicitudesCreditos().get(0).solicitudCredito(), 1000);
	}

	@Test
	void testClienteSolicitudHipotecarioNoEsPosible() {
		solicitudCreditoHipotecatio = new SolicitudCreditoHipotecario(15000, 12, cliente, inmobiliaria);
		banco.registrarSolicitudCredito(solicitudCreditoHipotecatio, cliente);
		assertEquals(banco.calcularMontoTotal(), 0);
	}
	
	@Test
	void testClienteSolicitudPersonalNoEsPosible() {
		cliente.setSueldoNetoAnual(10000);
		solicitudCreditoPersonal = new SolicitudCreditoPersonal(35000, 12, cliente);
		banco.registrarSolicitudCredito(solicitudCreditoPersonal, cliente);
		assertEquals(banco.calcularMontoTotal(), 0);
	}
}
