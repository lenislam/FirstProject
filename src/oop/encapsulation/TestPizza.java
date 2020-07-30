package oop.encapsulation;

public class TestPizza {

    public static void main(String[] args) {
        Pizza newPizza=new Pizza(); // Using default constructor
        String m= newPizza.pizzaName="scicilian";
        System.out.println("Mujahid love to eat "+m +" pizza");


        Pizza new1Pizza=new Pizza("Cheese");// Pass the argument
        new1Pizza.pizzaPrice=40.50;
        System.out.println(new1Pizza.pizzaPrice);


        Pizza new2Pizza=new Pizza("Cheese with vegetable",45.50,"Mexican Type");
        new2Pizza.setSauceType("Hot");
        new2Pizza.setTopping("Chicken");
        System.out.println("Sauce type is "+newPizza.getSauceType()+"Topping is "+newPizza.getTopping());
        newPizza.isAvailable();
        System.out.println(newPizza.isAvailable());

    }
}
