package operator;

public class ConditionalOperator {
    // && Conditional AND: all condition must have to be true
    // || Conditional OR : if one condition is true then block execute
    // pipe ||
    // false || false = false
    // false || true = true
    // true || false = true
    // true || true = true

    public static void main(String[] args) {

        int num1=55;
        int num2=40;
        if (num1==num2){
            System.out.println("num1 is equal num2");
        }
        if(num1==55 && num2==40){    // all condition must have true
            System.out.println(" I love pizza");
        }
        if(num1==56 || num2==40){
            System.out.println(" I love NY");
        }

    }
}
