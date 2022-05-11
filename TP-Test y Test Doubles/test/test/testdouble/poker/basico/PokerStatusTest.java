package test.testdouble.poker.basico;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import test.testdoubles.poker.basico.PokerStatus;

public class PokerStatusTest {

	PokerStatus pokerStatus;

	@BeforeEach
	void setUp() throws Exception {
		pokerStatus = new PokerStatus();
	}

	@Test
	void testNoHayPoker() {
		assertFalse(pokerStatus.verificar("QD", "10D", "3T", "9C", "8P"));
	}
	
	@Test
	void testSiHayPoker() {
		assertTrue(pokerStatus.verificar("8D", "8D", "8T", "10D", "8P"));
	}
}
