import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        int answer = Calculator.add(2,3);
        assertEquals(5, answer);
    }

    @Test
    public void testSubtract() {
        int answer = Calculator.subtract(2,3);
        assertEquals(-1, answer);
    }

    @Test
    public void testMultiply() {
        int answer = Calculator.multiply(2,3);
        assertEquals(6, answer);
    }

    @Test
    public void testDivide() {
        int answer = Calculator.divide(2,3);
        assertEquals(0, answer);
    }
}
