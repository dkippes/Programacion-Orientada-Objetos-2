package ar.com.unq.po2.tp3.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class DesarmadorNumeros {
	private List<Integer> numeros;
	
	public DesarmadorNumeros() {
		this.numeros = new ArrayList<>();
	}
	
	public DesarmadorNumeros addNumero(Integer numero) {
		this.numeros.add(numero);
		return this;
	}
	
	public Integer numeroConMayorNumerosPares() {
		if (this.numeros.isEmpty()) {
			return null;
		}
		Integer numeroMayor = this.numeros.get(0);
		
		for (Integer i : this.numeros) {
			Integer actual = contarNumerosPares(numeroMayor);
			Integer temp = contarNumerosPares(i);
			if (temp > actual) {
				numeroMayor = i;
			}
		}
		return numeroMayor;
	}
	
	private Integer contarNumerosPares(Integer numero) {
		Integer contarPares = 0;
		Integer i = numero;
		while(i > 0) {
			Integer decimal = i % 10;
			if ( decimal % 2 == 0 ) {
				contarPares++;
			}
			i = i / 10;
		}
		return contarPares;
	}
}
