package controlflow;

public class InfoSwitchCase {
    //Switch (Condition){case number : Statement break}
    public static void main(String[] args) {
        int foodSerial;
        InfoSwitchCase myFood = new InfoSwitchCase();
        myFood.foodMenu(5);
    }
    public void foodMenu(int foodSerial){
        String foodName;
        switch (foodSerial) {
            case 1:
                foodName = "Pizza";
                break;
            case 2:
                foodName = "Burger";
                break;
            case 3:
                foodName = "Chicken";
                break;
            case 4:
                foodName = "Biriany";
                break;
            case 5:
                foodName = "Beaf";
                break;
            case 6:
                foodName = "Fried Rice";
                break;
            case 7:
                foodName = "Sandwich";
                break;
            case 8:
                foodName = "Sharma";
                break;
            case 9:
                foodName = "Roll";
                break;
            case 10:
                String drinks="Coke";
                System.out.println(drinks);
                foodName = "Coffee";
                int qty=3;
                if(qty<=3){
                    System.out.println("Your order delivery");
                }else{
                    System.out.println("Your order not delivered");
                }
                break;
            default:
                foodName="Invalid Food Name";
                break;
        }
        System.out.println("My food items during break is "+foodName);
    }
}
