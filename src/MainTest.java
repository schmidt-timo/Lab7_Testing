import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Main main = new Main();
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


}