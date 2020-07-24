package advance;

public class Test {

    public static void main(String[] args) {
        InfoSingleton test=InfoSingleton.mujahid();
        test.pizzaName="American Pizza";
        test.pizzaDeliveryCharge ="8";
        String deliveryCharge=test.pizzaDeliveryCharge="8";
        System.out.println(deliveryCharge);
        System.out.println(test.pizzaName);

        test.setSize('M');
        test.getSize();
        System.out.println("Pizza size is "+test.getSize());
    }
}
