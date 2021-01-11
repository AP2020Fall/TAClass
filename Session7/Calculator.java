public class Calculator {
    private Calculator() {
    }

    private static Calculator calculator;

    public static Calculator getCalculator() {
        if (calculator == null)
            calculator = new Calculator();
        return calculator;
    }

    public double add(double first, double second) {
        return first + second;
    }

    public double subtract(double first, double second) {
        return first - second;
    }

    public double multiply(double first, double second) {
        return first * second;
    }

    public double divide(double first, double second) {
        return first / second;
    }

    public double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public double log(double number) {
        return Math.log10(number);
    }

    public double sin(double number) {
        return Math.sin(number);
    }

    public double cos(double number) {
        return Math.cos(number);
    }

    public double tan(double number) {
        return Math.tan(number);
    }

    public double cot(double number) {
        return 1.0 / tan(number);
    }

    public double abstractValue(double number) {
        return Math.abs(number);
    }

}