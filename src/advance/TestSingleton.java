package advance;

public class TestSingleton {
    private static TestSingleton islam = null;
    public String name, name1;
    public int pizzaPrice;

    private TestSingleton(){
        name = " Mohammad Islam";
        name1="Mujahid";
        pizzaPrice= 6;
    }

    public static TestSingleton mujahid(){
        if (islam == null)
            islam = new TestSingleton();
        return islam;
    }

    public static void main(String[] args) {
        TestSingleton container=mujahid();
        TestSingleton container1=mujahid();
        TestSingleton container2=mujahid();
        container.name=(container.name).toUpperCase();
        System.out.println("Input reflection container :"+container.name);
        System.out.println("Input reflection container1 :"+container1.name);
        System.out.println("Input reflection container2 :"+container2.name);
        container1.name=(container1.name).toLowerCase();
        System.out.println("input reflection container1 :" +container1.name);
        System.out.println("input reflection container :" +container.name);
        container1.pizzaPrice=(container1.pizzaPrice);
        System.out.println("input reflection container1 :" +container1.pizzaPrice);
        System.out.println("input reflection container :" +container.pizzaPrice);
    }

}
