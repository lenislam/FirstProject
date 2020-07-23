package operator;

public class UnaryOperator {

    // Increment operator: ++ always add 1
    // PreIncrement: ++number
    // Post Increment : number++
    // Decrement Operator : -- Decrease -1
    // PreIncrement: --number
    // PostIncrement: number--

    public static void main(String[] args) {

        int number=20;
        // PreIncrement: ++number
        ++number;
        System.out.println(number);

        //Post Increment : number++
    //number++;
        System.out.println(number++);
        System.out.println(number);

        --number;
        System.out.println(number);

        number--;
        System.out.println(number);

        System.out.println("===========================");

        number--; // 19-1
        number--;//18-1
        --number;//17
        --number;//17-1
        System.out.println(number);


    }

}