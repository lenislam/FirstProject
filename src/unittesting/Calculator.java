package unittesting;

public class Calculator {
    // Return type method without Parameter:
    public static int doSummation() {
        int number1 = 20;
        int number2 = 30;
        int sum = number1 + number2;
        System.out.println("Summation value is " + sum);
        return sum;
    }

    // Return type method with Parameter: Dynamic
    public static int doSubtraction(int num1, int num2) {
        int number1 = num1;
        int number2 = num2;
        int sub = number2 - number1;
        System.out.println("Subtraction Value is " + sub);
        return sub;
    }

    // Non Return Method without Parameter:
    public void doMultiply(){
        int number1 = 20;
        int number2 = 30;
        int multiply = number1 * number2;
        System.out.println("multiply value is " + multiply);
    }

    // Non Return Method with Parameter:
    public static void doMultiply(int number1,int number2){
        int multiply = number1 * number2;
        System.out.println("multiply value is " + multiply);
    }


    public void doDivision(double num1, double num2){
        double division=num2/num1;
        System.out.println("Division value is "+division);
    }
    public String stInfo(String fName, String lName, int age){
        String fullName=fName+" "+lName;
        System.out.println("Full Name : "+fullName+ "Age "+age);
        return fullName;
    }
}

