import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Main main = new Main();
    }

    @Test
    void testMinValue() {
        assertEquals(2147483647, Main.absoluteValueOf(-2147483648));
    }

    @Test
    void testMaxValue() {
        assertEquals(2147483647, Main.absoluteValueOf(2147483647));
    }

}