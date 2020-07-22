package constructor;

public class InfoConstructor {
// Constructor name will be same as class name.
    // Constructor has no return type.
    // Constructor are needed to initialized /  created the object.
    // Before creating parameterize constructor, we must have to create Default Constructor.

    // Default / Non Parameterize Constructor
    // Parameterized Constructor.

    String name;
    String address;
    int age;
    double courseFee;

    public InfoConstructor(){ // JDK automatically create the default constructor
        // Default constructor
        System.out.println("This is a default Constructor");
    }
    public InfoConstructor(String newName){ //Single Parameterize Constructor
        this.name=newName;
        System.out.println(this.name);
    }
    public InfoConstructor(String newName, String newAddress){ //Multi Parameterize Constructor
        this.name=newName;
        this.address=newAddress;
        System.out.println(this.name+" "+this.address);
    }
    public InfoConstructor(String newName, String newAddress, int newAge){ //Multi Parameterize Constructor
        this.name=newName;
        this.address=newAddress;
        this.age=newAge;
        System.out.println(this.name+" "+this.age+" "+this.address);
    }
    // Parameter signature pattern is different
    public InfoConstructor(int newAge,String newAddress, String newName){
        this.name=newName;
        this.address=newAddress;
        this.age=newAge;
        System.out.println(this.age+" "+this.name+" "+this.address);
    }

    // Parameter signature pattern is same so showing error.
//    public InfoConstructor(int number,String price, String place){
//        this.name=place;
//        this.address=price;
//        this.age=number;
//        System.out.println(this.age+" "+this.name+" "+this.address);
//    }

    public static void main(String[] args) {
        InfoConstructor info = new InfoConstructor("Mujahid"); // declare the value called Argument passing.
        info.age=34;
        System.out.println("Robert age is "+info.age);
        InfoConstructor obj = new InfoConstructor("Islam", "Ozone Park");
        obj.address="Queens,NY";
        System.out.println("I leave in "+obj.address);
        InfoConstructor old =new InfoConstructor("Shohel","NY", 45);
        old.courseFee=4500;
        System.out.println("Our course fee is "+old.courseFee);
        InfoConstructor dc = new InfoConstructor();
        dc.name="Saleh";
        System.out.println("My friend's name is "+dc.name);

    }
}
