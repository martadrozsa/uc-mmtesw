package calculator;

import calculator.entities.Multiplication;
import calculator.entities.Operation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMultiplicationCalculator {

    @Test
    public void multiTest() {
        Operation operationMulti = new Multiplication();
        double resultMulti = operationMulti.calculate(6, 6);
        double expectedReturn = 36.0;
        assertEquals(resultMulti, expectedReturn, 0);

    }
}