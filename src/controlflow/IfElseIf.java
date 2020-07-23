package controlflow;

public class IfElseIf {

    public static void main(String[] args) {
        double score=75;

        if (score>=90){
            System.out.println("Your  grade is A+");
        }else if(score>=80){
            System.out.println("Your grade is A");
        }else if (score >=70){
            System.out.println("Your grade is B");
        }else if (score>=60){
            System.out.println("Your grade is C");
        }else {
            System.out.println("You grade is F");
        }
    }
}
