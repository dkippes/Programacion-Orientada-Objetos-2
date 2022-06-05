package tpSolid.banco.prestamo;

public abstract class SolicitudCredito implements Solicitud {
	protected int monto;
	protected int plazoMeses;
	protected Cliente cliente;
	
	public SolicitudCredito(int monto, int plazoMeses, Cliente cliente) {
		this.monto = monto;
		this.plazoMeses = plazoMeses;
		this.cliente = cliente;
	}

	public final int solicitudCredito() {
		if(esAceptable()) {
			return monto / plazoMeses;
		} else {
			return 0;
		}
	}
	
	public abstract boolean esAceptable();
}
