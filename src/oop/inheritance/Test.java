package oop.inheritance;

public class Test {

    public static void main(String[] args) {
        Father father=new Father();
        father.height();
        father.setGrandFatherSSN(248799824);
        System.out.println(father.getGrandFatherSSN());

        Son son=new Son();
        son.playGame();
        son.swim();

        Daughter daughter=new Daughter();
        daughter.cook();
        daughter.height();
        daughter.occupation();

    }
}
