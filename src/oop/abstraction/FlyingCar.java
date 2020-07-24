package oop.abstraction;

public abstract class FlyingCar extends ModernCar {

    public boolean isEmergencyExit=true;

    public abstract void sensor();
    public abstract void flyingFeature();
    public abstract void boostEngine();
    public abstract void airbag();

        public void takeOfLanding(){
            System.out.println("Flying car has take off landing feature");
        }
}
