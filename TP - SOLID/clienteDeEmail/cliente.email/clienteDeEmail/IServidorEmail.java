package clienteDeEmail;

import java.util.List;

public interface IServidorEmail {
	public List<Correo> recibirNuevos(ClienteEMail user);

	public void enviar(Correo correo);
}
