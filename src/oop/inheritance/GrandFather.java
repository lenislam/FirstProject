package oop.inheritance;

public class GrandFather {

    // Some private and public variables and methods

    public String favouriteDish="Steak";
    public String favouriteSportTeam="Brazil";
    public String favouriteCar="Toyota";

    private long grandFatherSSN=458316789L;

    public long getGrandFatherSSN() {
        return grandFatherSSN;
    }

    public void setGrandFatherSSN(long grandFatherSSN) {
        this.grandFatherSSN = grandFatherSSN;
    }

    public GrandFather(String favouriteDish) {
        this.favouriteDish = favouriteDish;
    }

    public GrandFather(String favouriteSportTeam, String favouriteCar) {
        this.favouriteSportTeam = favouriteSportTeam;
        this.favouriteCar = favouriteCar;
    }

    public GrandFather() {
    }

    public void height(){
        System.out.println("Grand Father height is 6.1 inch");
    }

    public void weight(){
        System.out.println("Grand Father weight is 180 lbs");
    }

    public void playGame(){
        System.out.println("Grand Father can play Football");
    }



}
