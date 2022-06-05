package clienteDeEmail;

import java.util.ArrayList;
import java.util.List;

public class ServidorPop extends ServidorEmail {

	@Override
	public float tazaDeTransferencia() {
		//no corresponde
		return 0;
	}

	@Override
	public void resetear() {
         //no corresponde		
	}

	@Override
	public void realizarBackUp() {
		//no corresponde
		
	}
}
