package operator;

public class ArithmaticOperator {
    // + Additive operator
    // - subtraction operator
    // * Multiplication
    // / division
    // % remainder

    public static void main(String[] args) {
        int x = 70;
        int y = 30;

        int summation = x+y;
        System.out.println("Summation is "+summation);

        int subtraction = x-y;
        System.out.println("Subtration value is "+subtraction);

        int multiplication = x*y;
        System.out.println("The multiplication value is "+multiplication);

        int division = x/y;
        System.out.println("The value of division is "+division);

        int remainder = x%y;
        System.out.println("The rest value is "+remainder);

        double num3 = 50.5;
        double num4 = 20;
        double remainder1=num3%num4;
        System.out.println("The new value"+remainder1);
    }
}