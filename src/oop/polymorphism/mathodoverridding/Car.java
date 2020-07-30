package oop.polymorphism.mathodoverridding;

public class Car {

    public void carStart(){
        System.out.println("Car has start feature");
    }

    public void carStop(){
        System.out.println("Car has stop feature");
    }

    public void carEngine(String engineName){
        System.out.println("Car has engine"+engineName);
    }
}
