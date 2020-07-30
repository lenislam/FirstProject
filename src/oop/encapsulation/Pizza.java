package oop.encapsulation;

public class Pizza {


    public String pizzaName="American Pizza";
    public double pizzaPrice=50.50;

    private String pizzaType="Chicken";
    private String sauceType;
    private String topping;
    private char size;
    private boolean isAvailable;

    public Pizza() {

    }

    public Pizza(String pizzaName) {
        this.pizzaName = pizzaName;
        System.out.println("Islam love "+pizzaName);
    }

    public Pizza(String pizzaName, double pizzaPrice) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
    }

    public Pizza(String pizzaName, double pizzaPrice, String pizzaType) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
        this.pizzaType = pizzaType; // private
        System.out.println("love to eat "+pizzaName+","+ "price is "+pizzaPrice+ "and"+"type of pizza is"+pizzaType);
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getSauceType() {
        return sauceType;
    }

    public void setSauceType(String sauceType) {
        this.sauceType = sauceType;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Pizza(String pizzaType, String sauceType, String topping, char size) {
        this.pizzaType = pizzaType;
        this.sauceType = sauceType;
        this.topping = topping;
        this.size = size;
    }

    // Though private constructor not show other class, so we need to create getter and setter
    // to call the private constructor



}
