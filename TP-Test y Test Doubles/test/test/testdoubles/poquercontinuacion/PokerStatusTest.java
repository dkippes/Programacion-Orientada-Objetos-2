package test.testdoubles.poquercontinuacion;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokerStatusTest {

	PokerStatus pokerStatus;
    
    @BeforeEach
    void setUp() throws Exception {
        pokerStatus = new PokerStatus();
    }

    @Test
    void testNoHayNingunaJugada() {
        assertEquals("Nada", pokerStatus.verificar("8D", "10D", "3T", "3T", "8T"));
    }
    
    @Test
    void testSiHayPoker() {
        assertEquals("Poker", pokerStatus.verificar("8D", "8D", "8T", "10D", "8T"));
    }
    
    @Test
    void testHayPokerPartiendoDeLaSegundaCarta() {
        assertEquals("Poker", pokerStatus.verificar("10D", "8D", "8T", "8T", "8T"));
    }
    
    @Test
    void testColor() {
        assertEquals("Color", pokerStatus.verificar("3T", "3T", "3T", "3T", "3T"));
    }
    
    @Test
    void testTrio() {
        assertEquals("Trio", pokerStatus.verificar("8D", "10D", "10D", "10D", "8T"));
    }
}
