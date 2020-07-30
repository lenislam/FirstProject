package datastructurealgorithm.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class InfoArrayList {

    // List is an interface
    // List has the ability to take unlimited data length
    // Arraylist is dynamic so no need to declare size or length of the array.

     public static void main(String[] args) {
       ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
//access an item
        System.out.println(cars.get(0));
        cars.set(0,"toyota");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
        cars.add("Honda");
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.contains("BMW"));
//You can also loop through an ArrayList with the for-each loop:
        for(String i : cars){
           System.out.println(i);
        }
        for(int i =0; i<cars.size(); i++){
           System.out.println(cars.get(i));
        }
        Iterator it = cars.iterator();//use Iterator class name = arraylist ob
        while (it.hasNext()){
            Object i = it.next();
            System.out.println(i);
        }
    }



    }
