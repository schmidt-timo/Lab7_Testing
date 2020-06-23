import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    	oddTest();
    	evenTest();
    }

    @org.junit.jupiter.api.Test
    void oddTest() {
    	assertEquals(41, Main.absoluteValueOf(41));
    }

    @org.junit.jupiter.api.Test
    void evenTest() {
    	assertEquals(6, Main.absoluteValueOf(6));
    }
    

}