package controlflow;

public class NestedIfElse {

    public static void main(String[] args) {

        int age =2;
        if (age>18){
            System.out.println("Your are Boy");
            if (age>24){
                System.out.println("You are adult");
                if (age>22){
                    System.out.println("You are Youth");
                }else{
                    System.out.println("You are not youth");
                }
            }else{
                System.out.println("You are below");
            }
        }else {
            System.out.println("You are not not adult ");
            if (age>10){
                System.out.println("you are teenager");
            }else if(age>1){
                System.out.println("You are a baby");

            }
        }
    }
}
