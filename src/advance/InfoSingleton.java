package advance;

public class InfoSingleton {
    // we are allowed to create one instance of a class at a time
    // Using private constructor we can ensure that no more than one object can be created at a time

    public String pizzaName;
    public int pizzaPrice;
    public String pizzaQty;
    public String pizzaDeliveryCharge;
    private char size = 'L';
    private boolean isAvailable;

    private InfoSingleton(){
        // Private constructor must create
    }
        // Create instance variable / object
    private static InfoSingleton single=new InfoSingleton();
    //Create a public method
    public static InfoSingleton mujahid(){
        return single;
    }


// Getter and Setter: Get/Set

    // size get
    public char getSize() {
        return size;
    }
    // size set
    public void setSize(char size) {
        this.size = size;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }





}
