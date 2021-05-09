import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KapperTest {
    Kapper kapper=new Kapper();
    @org.junit.jupiter.api.Test
    void checkOfAfspraakGemaaktKanWorden() {
        assertTrue(kapper.checkOfAfspraakGemaaktKanWorden(true, true, true));
        assertFalse(kapper.checkOfAfspraakGemaaktKanWorden(false, true, true));
        assertFalse(kapper.checkOfAfspraakGemaaktKanWorden(true, false, true));
        assertFalse(kapper.checkOfAfspraakGemaaktKanWorden(true, true, false));
    }

    @Test
    void berekenPrijs() {
        assertEquals(10, kapper.berekenPrijs(0), 0.001);
        assertEquals(10, kapper.berekenPrijs(1), 0.001);
        assertEquals(10, kapper.berekenPrijs(9), 0.001);
        assertEquals(15, kapper.berekenPrijs(10), 0.001);
        assertEquals(15, kapper.berekenPrijs(11), 0.001);
        assertEquals(15, kapper.berekenPrijs(17), 0.001);
        assertEquals(17.50, kapper.berekenPrijs(18), 0.001);
        assertEquals(17.50, kapper.berekenPrijs(19), 0.001);
    }
}