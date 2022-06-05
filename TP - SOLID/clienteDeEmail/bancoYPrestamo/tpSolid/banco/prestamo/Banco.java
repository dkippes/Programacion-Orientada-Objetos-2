package tpSolid.banco.prestamo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cliente> clientes = new ArrayList<>();
	private List<Solicitud> solicitudesCreditos = new ArrayList<>();
	
	public void agregarUsuario(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void registrarSolicitudCredito(Solicitud solicitud, Cliente cliente) {
		if(clientes.contains(cliente)) {
			solicitudesCreditos.add(solicitud);	
		}
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public List<Solicitud> getSolicitudesCreditos() {
		return solicitudesCreditos;
	}

	public int calcularMontoTotal() {
		return solicitudesCreditos.stream()
				.map(solicitud -> solicitud.solicitudCredito())
				.reduce(0, (subtotal, solicitudActual) -> subtotal + solicitudActual);
	}
}
