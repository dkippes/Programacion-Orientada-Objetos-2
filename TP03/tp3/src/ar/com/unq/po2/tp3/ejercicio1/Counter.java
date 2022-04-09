package ar.com.unq.po2.tp3.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	private List<Integer> numeros;
	
	public Counter() {
		this.numeros = new ArrayList<>();
	}
	
	private List<Integer> getNumeros() {
		return this.numeros;
	}

	public Counter addNumer(Integer numero) {
		this.numeros.add(numero);
		return this;
	}
	
	public int contarPares() {
		return (int) this.getNumeros()
				.stream()
				.filter(n -> n % 2 == 0)
				.count();
	}
	
	public int contarImpares() {
		return (int) this.getNumeros()
				.stream()
				.filter(n -> n % 2 != 0)
				.count();
	}
	
	public int contarMultiplos(Integer numero) {
		return (int) this.getNumeros()
				.stream()
				.filter(n -> n % numero == 0)
				.count();
	}
}
