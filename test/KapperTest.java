import static org.junit.jupiter.api.Assertions.*;

class KapperTest {

    @org.junit.jupiter.api.Test
    void checkOfAfspraakGemaaktKanWorden() {
        Kapper kapper=new Kapper();
        assertTrue(kapper.checkOfAfspraakGemaaktKanWorden(true, true, true));
        assertFalse(kapper.checkOfAfspraakGemaaktKanWorden(false, true, true));
        assertFalse(kapper.checkOfAfspraakGemaaktKanWorden(true, false, true));
        assertFalse(kapper.checkOfAfspraakGemaaktKanWorden(true, true, false));
    }
}