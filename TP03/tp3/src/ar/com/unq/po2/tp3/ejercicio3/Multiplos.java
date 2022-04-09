package ar.com.unq.po2.tp3.ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Multiplos {
	private Integer x;
	private Integer y;
	
	public Multiplos() {
		
	}
	
	public Integer calcularMayorMultiplo() {
		List<Integer> listaMultiplosX = listaDeMultiplos(this.getX());
		List<Integer> listaMultiplosY = listaDeMultiplos(this.getY());
		
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

	public Integer getX() {
		return this.x;
	}
	
	public Integer getY() {
		return this.y;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
