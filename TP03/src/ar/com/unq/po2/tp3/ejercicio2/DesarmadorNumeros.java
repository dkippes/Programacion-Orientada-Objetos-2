package ar.com.unq.po2.tp3.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class DesarmadorNumeros {
	
	public int numeroConMayorNumerosPares(int[] numeros) throws Exception {
		if (numeros.length == 0) {
			throw new Exception("No puede ser un array vacio");
		}
		int numeroMayor = numeros[0];
		
		for (int i : numeros) {
			int actual = contarNumerosPares(numeroMayor);
			int temp = contarNumerosPares(i);
			if (temp > actual) {
				numeroMayor = i;
			}
		}
		return numeroMayor;
	}
	
	private int contarNumerosPares(int numero) {
		int contarPares = 0;
		int i = numero;
		while(i > 0) {
			int decimal = i % 10;
			if ( decimal % 2 == 0 ) {
				contarPares++;
			}
			i = i / 10;
		}
		return contarPares;
	}
}
