package oop.abstraction;

public interface Car {
    // Interface is 100% abstract

//    start()
//    stop()
//    wheel()
//    engine()
//    acceleration()
//    steering()
//    break()
    // Only declare method
    public void startCar(); //{ not create body,it's rule of interface}
    public void stopCar();
    public void wheelCar();
    public void engineCar();
    public void accelerate();
    public void steeringCar();
    public void breakCar();

    //In interface you declare and initialized value
    public String seat="2";
    public String headlight="4";
    public boolean gasTank=true;


}
