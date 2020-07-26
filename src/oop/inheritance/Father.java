package oop.inheritance;

import java.sql.SQLOutput;

public class Father extends GrandFather{

    //Single level inheritance

    public String favouriteMeal="Rice with vegetable";
    public String favouriteTeam="England";
    public String favouriteCar="BMW";

    private long fatherSSN=478549875L;

    public Father() {
    }

    public Father(String favouriteMeal) {
        this.favouriteMeal = favouriteMeal;
    }

    public Father(String favouriteTeam, String favouriteCar) {
        this.favouriteTeam = favouriteTeam;
        this.favouriteCar = favouriteCar;
    }

    public long getFatherSSN() {
        return fatherSSN;
    }

    public void setFatherSSN(long fatherSSN) {
        this.fatherSSN = fatherSSN;
    }

    public void swim(){
        System.out.println("Father like swim");
    }

    public void workFor(){
        System.out.println("Father work for Army");
    }

    public void hobby(){
        System.out.println("Father's hobby is reading");
    }

}
