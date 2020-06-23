import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

    // Odd test
    @Test
    void oddTest() {
    	assertEquals(41, Main.absoluteValueOf(41));
    }

    //positive integer
    @Test
    void testPositive() {
        assertEquals(709, Main.absoluteValueOf(709));
    }

    //negative integer
    @Test
    void testNegative(){
        assertEquals(77, Main.absoluteValueOf(-77));
    }

    @Test
    void evenTest() {
    	assertEquals(6, Main.absoluteValueOf(6));
    }
    

}