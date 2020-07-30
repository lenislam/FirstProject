package datastructurealgorithm.Array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class InfoArray {

    public static void main(String[] args) {

        /**
         * Data Structure
         * Date
         */

        String name = "Mizan";
        String name1 = "Jony";
        String name2 = "Zakrin";
        String name3 = "Shuvo";
        String name4 = "Sharif";
        // Arrays are used to store multiple value in a single variable instead of declaring seperate variable for each value.
        System.out.println(name3);

        String name5;
        // Declare
        //Data Type []VariableName

        String[] studentName;
        //Declare and initialize value
        // Array index is always start from 0.
        String[] stName = {"Rana", "Tony", "Robin", "Selim", "Anam"};

        System.out.println(stName[0]);

        System.out.println("My name is " + stName[2]);
        //System.out.println("His name is :" + stName[0 + 3]);
        System.out.println("He is :" + stName[1 + 3]);
        //Length of array.
        System.out.println(stName.length);
        System.out.println("========================");
        //System.out.println("Student name is " + stName[6]);
        try {
            System.out.println("Student name is " + stName[6]);
        } catch (Exception e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }
        try {
            System.out.println("My name is " + stName[2]);
        } catch (Exception e) {
            System.out.println("Index Out Of Bounds Exception");
        }

        for (int i = 0; i<stName.length; i++){
            System.out.println("Students name :" + stName[i]);
        }
        //For each loop
        // for (type variable : arrayName) {   }
        for (String st:stName){
            System.out.println("Student name is: "+st);

        }
        System.out.println("=====================================");
        for (int i=0; i<stName.length;i++){
            if (stName[i]=="Selim") {
                System.out.println("Your name is " + stName[i]);
            }
        }
        System.out.println("======================================");
        //Declare Arrays with Length
        String [] studentAddress=new String[6];
        System.out.println(studentAddress.length);
        studentAddress[0]="NY USA";
        studentAddress[1]="FL USA";
        studentAddress[2]="CA USA";
        studentAddress[3]="VA USA";
        studentAddress[4]="TX USA";
        studentAddress[5]="WA USA";
        System.out.println(studentAddress[5]);

        //Retrieve value by using for each loop
        for (String obj:studentAddress) {
            System.out.println("Student Address"+ obj);
        }
     //String[] studentName;
        //Single Dimensional Array
    }

}
