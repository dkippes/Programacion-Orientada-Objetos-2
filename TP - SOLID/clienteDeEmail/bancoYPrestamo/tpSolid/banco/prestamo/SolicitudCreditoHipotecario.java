package tpSolid.banco.prestamo;

public class SolicitudCreditoHipotecario extends SolicitudCredito {
	private PropiedadInmobiliaria propiedad;

	public SolicitudCreditoHipotecario(int monto, int plazoMeses, Cliente cliente, PropiedadInmobiliaria propiedad) {
		super(monto, plazoMeses, cliente);
		this.propiedad = propiedad;
	}

	@Override
	public boolean esAceptable() {
		int cincuentaPorciertoMensual = (int) (cliente.getSueldoNetoMensual() * 0.5);
		int edadDeLaPersonaAlTerminarLasCuotas = cliente.getEdad() + (plazoMeses / 12);
		int montoCuota = monto / plazoMeses;
		int sesentaValorFiscalPropiedad = (int) (propiedad.getValor() * 0.7);
		return montoCuota < cincuentaPorciertoMensual 
				&& monto < sesentaValorFiscalPropiedad 
				&& edadDeLaPersonaAlTerminarLasCuotas < 65;
	}
}
