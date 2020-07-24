package oop.abstraction;

public class Test {

    public static void main(String[] args) {
        GeneralMotors gm = new GeneralMotors();

        gm.startCar();
        gm.engineCar();
        gm.steeringCar();
        gm.wheelCar();
        gm.wheelCar();
        gm.stopCar();
        System.out.println("The number seat is "+gm.seat);
    gm.blindSpot();
    gm.backCamera();
    Tesla teslaobj=new Tesla();
        teslaobj.autoPilot();
        teslaobj.backCamera();
        teslaobj.accelerate();
        teslaobj.gps();
        teslaobj.airbag();

        System.out.println("====================================");
        //New concept
        Car myCar=new GeneralMotors();
        myCar.startCar();
        ((GeneralMotors) myCar).gps(); // casting class to use method

        ModernCar raza=new GeneralMotors();
        raza.blindSpot();
        ((GeneralMotors) raza).startCar();
    }
}