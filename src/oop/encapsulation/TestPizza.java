package oop.encapsulation;

public class TestPizza {

    public static void main(String[] args) {
        Pizza mujahidPizza=new Pizza(); // Using default constructor
        String m= mujahidPizza.pizzaName="scicilian";
        System.out.println("Mujahid love to eat "+m +" pizza");

        Pizza islamPizza=new Pizza("Checken with chesse");// Pass the argument
        islamPizza.pizzaPrice=40.50;
        System.out.println(islamPizza.pizzaPrice);


        Pizza newPizza=new Pizza("Cheese with vegetable",45.50,"Mexican Type");
        mujahidPizza.setSauceType("Hot");
        mujahidPizza.setTopping("Chicken");
        System.out.println("Sauce type is "+mujahidPizza.getSauceType()+"Topping is "+mujahidPizza.getTopping());

    }
}
