package calculator.entities;


public class Division implements Operation{

    @Override
    public double calculate(double num1, double num2) {
        double result = 0.0;

        if(num2 == 0) {
            System.out.println("Impossible division");
        }
        else {
            result = num1 / num2;
        }
        return result;
    }
}