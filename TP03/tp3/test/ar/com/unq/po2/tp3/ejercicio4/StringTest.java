package ar.com.unq.po2.tp3.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringTest {
	private String a;
	private String s;
	private String t;
	
	@BeforeEach
	void setUp() {
		a = "abc";
		s = a;
		t = "";
	}

	@Test
	void shouldReturnLengthOfs() {
		assertEquals(s.length(), 3);
	}
	
	@Test
	void shouldReturnLengthOft() {
		assertEquals(t.length(), 0);
	}
	
	@Test
	void shouldTest1Plusa() {
		assertEquals(1 + a, "1abc");
	}
	
	@Test
	void shouldTestAToUpperCase() {
		assertEquals(a.toUpperCase(), "ABC");
	}
	
	@Test
	void shouldTestLibertadIndexOf() {
		assertEquals("Libertad".indexOf("r"), 4);
		
	}
	
	@Test
	void shouldTesUniversidadLastIndexOf() {
		assertEquals("Universidad".lastIndexOf('i'), 7);
	}
	
	@Test
	void shouldTestQuilmesSubstring() {
		assertEquals("Quilmes".substring(2, 4), "il");
	}
	
	@Test
	void shouldTestALengthPlusAStartWith() {
		assertEquals((a.length() + a).startsWith("a"), false);
	}
	
	@Test
	void shouldTestSEqualsA() {
		assertEquals(s == a, true);
	}
	
	@Test
	void shouldTestASubstringEquals() {
		assertEquals(a.substring(1, 3).equals("bc"), true);
	}
}
