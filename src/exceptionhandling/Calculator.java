package exceptionhandling;

public class Calculator {

    public static void doDiv(double val,double val1){
        double result=val1/val;
        System.out.println("The division value is "+result);
    }
    public static void main(String[] args) {
        //doDiv(0,0);
        doDiv(20,30);
        Calculator.doDiv();
    }
    public static void doDiv() {
        try {
            int num1 = 45;
            int num2 = 10;
            int div = num1 / num2;
            System.out.println("The value is " + div);
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("This is Arethmatic ");
        }finally {
            System.out.println("This is Division Final result ");
        }
    }
    public static void doDiv1() {
            int num1 = 45;
            int num2 = 10;
            int div = num1 / num2;
            System.out.println("The value is " + div);
        }
    }