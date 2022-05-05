package interfaces.clases.la.caja.del.mercado2;

import java.util.List;

public class AgenciaRecaudadora implements Agencia {
	private List<Integer> facturas;

	@Override
	public void registrarPago(Factura factura) {
		this.facturas.add(factura.montoAPagar());
	}
	
	public List<Integer> getFacturas() {
		return facturas;
	}
}
