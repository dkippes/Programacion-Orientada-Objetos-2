package ar.com.unq.po2.tp3.ejercicio6;

public class Multioperador {
	
	public int sumar(int[] numeros) {
		int contador = 0;
		for(int i : numeros) {
			contador += i;
		}
		return contador;
	}

	public int restar(int[] numeros) {
		int contador = 0;
		for(int i : numeros) {
			contador -= i;
		}
		return contador;
	}

	public int multiplicar(int[] numeros) {
		int contador = 0;
		for(int i : numeros) {
			if(contador == 0) {
				contador = i;
				continue;
			}
			contador *= i;
		}
		return contador;
	}
	
}
