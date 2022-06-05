package tpSolid.banco.prestamo;

public class SolicitudCreditoPersonal extends SolicitudCredito {

	public SolicitudCreditoPersonal(int monto, int plazoMeses, Cliente cliente) {
		super(monto, plazoMeses, cliente);
	}
	
	@Override
	public boolean esAceptable() {
		int sesentaporciertoMensual = (int) (cliente.getSueldoNetoMensual() * 0.7);
		int montoCuota = monto / plazoMeses;
		return cliente.getSueldoNetoAnual() >= 15000 && montoCuota < sesentaporciertoMensual;
	}

}
