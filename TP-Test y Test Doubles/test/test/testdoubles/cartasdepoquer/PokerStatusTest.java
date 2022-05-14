package test.testdoubles.cartasdepoquer;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokerStatusTest {
	PokerStatus pokerStatus;
    Carta ochoD, diezD, ochoP, ochoT, tresT;
    
    @BeforeEach
    void setUp() throws Exception {
        pokerStatus = new PokerStatus();
        ochoD = new Carta("8", "D", "R");
        ochoT = new Carta("8", "T", "R");
        diezD = new Carta("10", "D", "N");
        tresT = new Carta("3", "T", "N");
    }

    @Test
    void testNoHayNingunaJugada() {
        assertEquals("Nada", pokerStatus.verificar(ochoD, diezD, tresT, tresT, ochoT));
    }
    
    @Test
    void testSiHayPoker() {
        assertEquals("Poker", pokerStatus.verificar(ochoD, ochoD, ochoT, diezD, ochoT));
    }
    
    @Test
    void testHayPokerPartiendoDeLaSegundaCarta() {
        assertEquals("Poker", pokerStatus.verificar(diezD, ochoD, ochoT, ochoT, ochoT));
    }
    
    @Test
    void testColor() {
        assertEquals("Color", pokerStatus.verificar(tresT, tresT, diezD, diezD, tresT));
    }
    
    @Test
    void testTrio() {
        assertEquals("Trio", pokerStatus.verificar(ochoD, diezD, diezD, diezD, ochoT));
    }
}
