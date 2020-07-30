package oop.polymorphism.mathodoverridding;

public class BMW extends FlyingCar implements NewCar {

        //Annotation
    @Override
    public void carStart(){
        System.out.println("BMW has latest start feature");
        System.out.println("BMW is nice car");
        System.out.println("I love BMW");
    }

    @Override
    public void carStop(){
        System.out.println("Change to update version in BMW");
        System.out.println(" It comes a new BMW");
    }
    @Override
    public void carEngine(String engineName){
        System.out.println("Change the engine from VVT to PPT");
    }

    @Override
    public void gps() {
        System.out.println("Newly apply the gps");
    }

    @Override
    public void flyingFeature() {
        System.out.println("Added new flying car feature");
    }
}
