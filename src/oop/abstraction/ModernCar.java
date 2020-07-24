package oop.abstraction;

public abstract class ModernCar {
    // Abstract is not fully 100% abstract
    public String modernCar="Telsa";   // We can initialize or without initialize value of variable;
    public String modernCarSuggestedPrice;

    // We can declare abstract and non abstract method
    public abstract void autoStart();
    public abstract void blindSpot();
    public abstract void preCollision();
    public abstract void heatingColling();
    public abstract void gps();
    public abstract void backCamera();
    public abstract void autoGear();

    //This non abstract methiod
    public void display(){
        System.out.println("Modern car has display");

    }



}
