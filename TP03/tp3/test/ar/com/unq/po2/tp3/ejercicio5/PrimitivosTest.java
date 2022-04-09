package ar.com.unq.po2.tp3.ejercicio5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrimitivosTest {
	
	/*
	 1) Son datos que derivan de la clase Wrapper, pero como tal no tiene metodos ni se necesita instanciar
	 2) Es una caracter de tipo numero de 32 bits que no tiene metodos, en cambio Integer es una clase que hace
	 refencia a los numeros enteros y como tal se puede usar como wrapper ya que posee metodos
	 3) Con int su valor predeterminado es 0, mientras que en Integer al no instanciarse su valor es null
	 4) En los metodos no falta inicializar la variable tanto int como Integer, pero si se desea retornarla hay
	 que inicializarla
	 */
	
	Primitivos primitivos;
	
	@BeforeEach
	void setUp() {
		primitivos = new Primitivos();
	}
	
	@Test
	void compareIntWithInteger() {
		assertNotEquals(primitivos.getX(), primitivos.getY());
	}
}
