package ar.com.unq.po2.tp3.ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Multiplos {
	
	public Integer calcularMayorMultiplo(int x, int y) {
		List<Integer> listaMultiplosX = listaDeMultiplos(x);
		List<Integer> listaMultiplosY = listaDeMultiplos(y);
		
		for (int i = listaMultiplosX.size() - 1; i >= 0; i--) {
			for (int j = listaMultiplosY.size() - 1; j >= 0; j--) {
				if (listaMultiplosX.get(i).equals(listaMultiplosY.get(j))) {
					return listaMultiplosX.get(i);
				}
			}
		}
		return -1;
	}
	
	private List<Integer> listaDeMultiplos(Integer numero) {
		List<Integer> lista = new ArrayList<>();
		
		for (int i = 1; i <= 1000; i++) {
			if((numero * i) > 1000) {
				break;
			}
			lista.add(numero * i);
		}
		return lista;
	}
}
