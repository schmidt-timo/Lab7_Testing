import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;

class MainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    	   Main main = new Main();
    }

    @org.junit.jupiter.api.Test
    void zeroTest() {
    	int zero = Main.absoluteValueOf(0);
    	Assert.assertTrue(zero == 0);
    }
    
    @org.junit.jupiter.api.Test
    void StringTest() {
    	String testString = "test";
    	int test = Main.absoluteValueOf(Integer.parseInt(testString));
    }
    
    // Odd test
    @Test
    void oddTest() {
    	assertEquals(41, Main.absoluteValueOf(41));
    }

    @Test
    void testMinValue() {
        assertEquals(2147483647, Main.absoluteValueOf(-2147483648));
    }

    @Test
    void testMaxValue() {
        assertEquals(2147483647, Main.absoluteValueOf(2147483647));
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