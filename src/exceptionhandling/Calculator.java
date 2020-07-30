package exceptionhandling;

public class Calculator {

    public static void doDiv(double val,double val1){
        double result=val1/val;
        System.out.println("The division value is "+result);
    }
    public static void main(String[] args) {
        //doDiv(0,0);
        doDiv(20,30);
        Calculator.doDiv1();
        Calculator.doDiv();

    }
    public static void doDiv1() {
        double num1 = 45;
        double num2 = 10;
        double div = num1 / num2;
        System.out.println("The value is " + div);
    }
       public static void doDiv() {
        try {
            //int num1 = 45;
           // int num2 = 10;
            int div = 45/0;
            System.out.println("The value is " + div);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e);
        }finally {
            System.out.println("It always run");
        }
    }

    }