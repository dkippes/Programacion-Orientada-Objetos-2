package interfaces.clases.la.caja.del.mercado2;

import java.util.ArrayList;
import java.util.List;

public class AgenciaRecaudadora implements Agencia {
	private List<Double> pagos;
	
	public AgenciaRecaudadora() {
		this.pagos = new ArrayList<Double>();
	}

	@Override
	public void registrarPago(Factura factura) {
		this.pagos.add(factura.montoAPagar());
	}
	
	public List<Double> getPagos() {
		return this.pagos;
	}
}
