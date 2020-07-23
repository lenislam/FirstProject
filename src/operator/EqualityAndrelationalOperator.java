package operator;

public class EqualityAndrelationalOperator {

    // == equal to
    //!= not equal
    //> Greater than
    //>= Greater than equal
    // < Less than
    //<= Less than equal

    public static void main(String[] args) {
        int num1 = 30;
        int num2 =40;

        // True or False
        // if condition is true then if block will execute else it will not excute
    if (num1==num2){
        System.out.println("num1 and num2 is equal");
    }
    if (num1!=num2){
        System.out.println("num1 and num2 are not equal");
    }
        if (num1>num2){
            System.out.println("num1 is greater than num2");
        }
        if (num1>=num2){
            System.out.println("num1 is not greater than equal num2");
        }
        if (num1<num2){
            System.out.println("num1 is less than num2");
        }
        if (num1<=num2){
            System.out.println("num1 is less than equal num2");
        }

    }
}
