package method;

import constructor.InfoConstructor;

public class InfoMehtod {

    //Method: block of code which runs when it is called.
    // Method is used to perform certain actions and they are known as function
    // Method Type: One is Return Type and Second one is Non Return Type
    // Return Type method without parameter
    // Return method with parameter.
    // Non return Method without parameter.
    //Non return Method with parameter.

    // Method syntax : AccessModifier ReturnType / MethodType MethodName (){Method Body
    //}
    // ReturnType/MethodType : Data Type/Class Type
    // MethodName : verb+noun

    public static void stInfo(){
        System.out.println("Student Information");
        System.out.println("Student Information");
        System.out.println("Student Information");
        System.out.println("Student Information");
    }

    // Return Type method without parameter
    public int doSummation(){
        int value = 35;
        int value1 = 25;
        int sum = value+value1;
        System.out.println("The summation value "+sum);
        return sum;
    }

    // Return Type method with parameter Dynamic
    public int doSubtraction(int num, int num1){
        int number=num;
        int number1=num1;
        int sub=number-number1;
        //System.out.println("The subtraction value is  "+sub);
        return sub;
    }

    public String inStudent(String fName,String lName,int age){
        String fullName = fName+" "+lName;
        System.out.println("Full Name : "+" "+fullName+" and my age is "+age);
        return fullName;
    }
    // Non return Method without parameter.
    public void doMultiply(){
        int value = 20;
        int value1 = 25;
        int multi = value*value1;
        System.out.println("The Multiply value "+multi);
    }

    //Non return Method with parameter.
    public void doDivision(int val,int val1){
       int divi=val1/val;
        System.out.println("The division value is "+divi);
    }
    public void doDiv(double val,double val1){
        double result=val1/val;
        System.out.println("The division value is "+result);
    }

    public static void main(String[] args) {
        InfoMehtod.stInfo();
        InfoMehtod obj = new InfoMehtod();
       obj.doSummation();
       obj.doSubtraction(70,50);
       obj.doSubtraction(200,73);
       obj.doSubtraction(250,100);
       obj.inStudent("Mohammad","Islam",45);
       obj.doMultiply();
       obj.doDivision(15,75);
       obj.doDivision(11,99);
       obj.doDiv(40.10,5.15);
       obj.doDiv(5.10,60.50);
        System.out.println("========================");

       int new1 = obj.doSubtraction(60,30);
       int new2 = new1 * 2;
       int value = new2 + 350;

       System.out.println("The subtraction value is  "+value);
    }

}
