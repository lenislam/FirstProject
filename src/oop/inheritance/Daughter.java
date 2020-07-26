package oop.inheritance;

public class Daughter extends Father {
    // Hierarchical level inheritance

    public String favouriteDress="Tops";
    public String favouritePlace="Statue of Liberty";
    public  String fevColor = "Blue";
    public String fevSports = "Basketball";

    private long daughterSSN=45786128L;

    public long getDaughterSSN() {
        return daughterSSN;
    }

    public void setDaughterSSN(long daughterSSN) {
        this.daughterSSN = daughterSSN;
    }

    public Daughter(){

    }

    public Daughter(String favouriteDress) {
        this.favouriteDress = favouriteDress;
    }

    public Daughter(String favouritePlace, String fevColor, String fevSports) {
        this.favouritePlace = favouritePlace;
        this.fevColor = fevColor;
        this.fevSports = fevSports;
    }
    public void paint(){
        System.out.println("Daughter like to paint");
    }
    public void cook(){
        System.out.println("Daughter like cook chicken");
    }
    public void occupation(){
        System.out.println("Daughter is a QE");
    }




}
