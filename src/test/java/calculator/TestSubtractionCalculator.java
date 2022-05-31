package calculator;

import calculator.entities.Operation;
import calculator.entities.Subtraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSubtractionCalculator {

    @Test
    public void subTest() {
        Operation operationSub = new Subtraction();
        double resultSub = operationSub.calculate(14, 8);
        double expectedReturn = 6.0;
        assertEquals(resultSub, expectedReturn, 0);

    }
}