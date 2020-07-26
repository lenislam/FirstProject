package oop.inheritance;

public class Son extends Father{
    //Multilevel inheritance

    public String favouriteSchool="PNT";
    public String educationalLevel="Bachlor of computer science";
    public String sportsLoveToPlay="Baseball";
    public String favGame="Hocky";

    private long sonSSN=457981245L;

    public Son() {
    }

    public Son(String favouriteSchool) {
        this.favouriteSchool = favouriteSchool;
    }

    public Son(String educationalLevel, String sportsLoveToPlay) {
        this.educationalLevel = educationalLevel;
        this.sportsLoveToPlay = sportsLoveToPlay;
    }

    public long getSonSSN() {
        return sonSSN;
    }

    public void setSonSSN(long sonSSN) {
        this.sonSSN = sonSSN;
    }

    public void huntingPlace(){
        System.out.println("Son love hunting");
    }

    public void travel(){
        System.out.println("Son love traveling");
    }

    public void party(){
        System.out.println("Son love party");
    }


}
