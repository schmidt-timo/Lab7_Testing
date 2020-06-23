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
    
}