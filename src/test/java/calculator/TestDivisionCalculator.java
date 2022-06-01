package calculator;

import calculator.entities.Division;
import calculator.entities.Operation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDivisionCalculator {

    @Test
    public void divisionTest() {
        double num1 = 15;
        double num2 = 3;
        Operation operationDivision = new Division();

        double resultDivision = operationDivision.calculate(num1, num2);
        double expectedReturn = 5.0;

        assertEquals(resultDivision, expectedReturn, 0);
    }

    @Test
    public void testDivideByZero() {
        double num1 = 10;
        double num2 = 0;
        Operation operationDivision = new Division();

        double res = operationDivision.calculate(num1, num2);

        assertEquals(0.0, res, 0);
    }
}