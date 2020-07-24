package advance;

public class InfoEnum {
// Enum : Enum declaration can be done outside of a class
// but not inside method
// Enum vs Class
// An enum can just like a class have attributes and method
// Enum constant are public, static and final. Unchangeable can not be override
// An enum can not be used to create objects and it can not extended others classes
// it can implement interfaces

// Use enum when you have values that you know are not going to change//
// Ex. Days, Colors

    public static void main(String[] args) {
        System.out.println(Color.BLUE);
        Color.colorInfo();
        System.out.println(Priority.HIGH);
        System.out.println(Display.MOBILE);

    }

    public enum Priority{
        LOW, HIGH, MEDIUM;
    }

    public enum Display{
        TV, MOBILE, LAPTOP
    }

}
