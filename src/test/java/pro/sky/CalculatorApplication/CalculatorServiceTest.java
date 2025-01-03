package pro.sky.CalculatorApplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
    private final CalculatorService out = new CalculatorServiceImpl();

    protected void runTest(Integer num1, Integer num2, Integer expectedSum, Integer expectedMinus) {
        assertEquals(expectedSum, out.plus(num1, num2));
        assertEquals(expectedMinus, out.minus(num1, num2));
    }

    @Test
    public void testWithPositiveNumbers() {
        runTest(5, 3, 8, 2);
    }

    @Test
    public void testWithNegativeNumbers() {
        runTest(-5, -3, -8, -2);
    }
}