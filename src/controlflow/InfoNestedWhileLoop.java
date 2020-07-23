package controlflow;

import java.util.Scanner;

public class InfoNestedWhileLoop {

    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        System.out.println("Enter your number");
        int numOfRaw=put.nextInt();

        for (int i = 1; i<=numOfRaw; i++){
            for (int j=1; j<=i; j++);
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
