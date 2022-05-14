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
        assertEquals("Nada", pokerStatus.verificar("8DR", "10DR", "3TN", "3TN", "8TR"));
    }
    
    @Test
    void testSiHayPoker() {
        assertEquals("Poker", pokerStatus.verificar("8DR", "8DN", "8TR", "10DN", "8TR"));
    }
    
    @Test
    void testHayPokerPartiendoDeLaSegundaCarta() {
        assertEquals("Poker", pokerStatus.verificar("10D", "8D", "8T", "8T", "8T"));
    }
    
    @Test
    void testColor() {
        assertEquals("Color", pokerStatus.verificar("8TR", "8TR", "4TR", "3TR", "3TR"));
    }
    
    @Test
    void testTrio() {
        assertEquals("Trio", pokerStatus.verificar("8DR", "10DR", "10DN", "10DN", "8TR"));
    }
}
