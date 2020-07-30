package oop.polymorphism.methodoverloading;

public class Calculator {
    // Method overloading

    public static void main(String[] args) {

    }
    public int doSummation(int number, int number1){
        int sum = number+number1;
        System.out.println("Summation value is "+sum);
        return sum;
    }

    public int doSummation(int number, int number1,int number2){
        int sum = number+number1+number2;
        System.out.println("Summation value is "+sum);
        return sum;
    }

    public int doSummation(String name, int number1,int number2){
        int sum =number1+number2;
        System.out.println("Summation value is "+sum +" "+"For James");
        return sum;
    }

}
