package clienteDeEmail;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class ServidorEmail implements IServidor, IServidorEmail {
	private Map<ClienteEMail, List<Correo>> usuariosRegistrados;

	public List<Correo> recibirNuevos(ClienteEMail user) {
		List<Correo> retorno = new ArrayList<Correo>();
		if (elUsuarioEstaRegistrado(user)) {
			retorno = this.usuariosRegistrados.get(user);
		}
		return retorno;
	}

	private boolean elUsuarioEstaRegistrado(ClienteEMail user) {
		return this.usuariosRegistrados.keySet().contains(user);
	}
	
	@Override
	public void conectar(ClienteEMail user) throws Exception {
		if (elUsuarioEstaRegistrado(user)) {
			   throw new Exception("El usuario es invalido");
			}
	}

	@Override
	public void enviar(Correo correo) {
		// realiza lo necesario para enviar el correo.
	}
}
