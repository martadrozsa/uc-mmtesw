package calculator;

import calculator.entities.Operation;
import calculator.entities.Sum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSumCalculator {

    @Test
    public void sumTest() {
        Operation operationSum = new Sum();
        double resultSum = operationSum.calculate(2, 8);
        double expectedReturn = 10.0;
        assertEquals(resultSum, expectedReturn, 0);

    }
}