package controlflow;

import java.util.Scanner;

public class InfoLoop {

    //Loop is allowing us to Execute a statement
    //For Loop
    // While Loop
    // Do .. Loop
    //For Each Loop


    public static void main(String[] args) {
        //For Loop
        //For (initialization; condition;Iteration{ }
        //initialization means startPoint
        // Condition
        //Iteration : Increment or Decrement

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hallo World");
//        }
        for (int i = 0; i < 4; i++) {
            Scanner putup = new Scanner(System.in);
            System.out.println("Enter food serial number:");
            int fs = putup.nextInt();
            InfoSwitchCase isc = new InfoSwitchCase();
            isc.foodMenu(fs);
        }
//        System.out.println("*********************************");
//        //Nested for loop
//        for (int i = 0; i < 5; i++) {
//            //parent loop
//            System.out.println(" Parent Nested Loop");
//            for(int j = 1; j < 3; j++) {
//                System.out.println("Print the nesteed For Loop");
//            }

        System.out.println("***********************");
        for (int i=0; i<=5; i=i+1){
            System.out.println("Print "+i);
        }
        System.out.println("***********************");
        for (int i=1; i<=10; i=i+2){
            System.out.println("Print 2nd  "+i);
        }
    }
}