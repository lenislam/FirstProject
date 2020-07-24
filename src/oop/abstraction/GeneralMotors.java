package oop.abstraction;

public class GeneralMotors extends ModernCar implements Car {
    // Concrete class
    // Implement means you get the right that means you r owner.

    String gmCarModel="2012M";
    double gmCarPrice = 50000.500;

    public void gmCarInfo(){
        System.out.println("General motor car information "+gmCarModel+ " "+gmCarPrice);
    }

    public void startCar() {
          System.out.println("General motor car has start feature");
    }
    public void stopCar() {
        System.out.println("General motor car has stop feature");
    }
    public void wheelCar() {
        System.out.println("General motor car has wheel");
    }
    public void engineCar() {
        System.out.println("General motor car has engine");
    }
    public void accelerate() {
        System.out.println("General motor car has accelerate");
    }
    public void steeringCar() {
        System.out.println("General motor car has steering");
    }
    public void breakCar() {
        System.out.println("General motor car has break");
    }
//  From ModernCar
    public void autoStart() {
        System.out.println("Modern car has auto start");
    }
    public void blindSpot() {
        System.out.println("Modern car has blind spot");
    }
    public void preCollision() {
        System.out.println("Modern car has pre collision");
    }
    public void heatingColling() {
        System.out.println("Modern car has heat cooling");
    }
    public void gps() {
        System.out.println("Modern car has gps");
    }
    public void backCamera() {
        System.out.println("Modern car has back camera");
    }
    public void autoGear() {
        System.out.println("Modern car has auto gear");
    }
}
