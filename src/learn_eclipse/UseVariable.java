package learn_eclipse;

public class UseVariable {
	//Variable
	
	//Left side=Right side
	// datatype nameOfVariable = variable value
	int a = 5;// Global variable
	//int means = integer numeric value
	// a is the name of varible
	// = means assign
	// 5 is the valueOfVariable
	
	int b = 8; // global variable
	// variable name start with small letter
	
	static int age = 46; // global variable
	
	// Type of variable:
	// Global variable / Instance variable : out side of the main method but inside the class
	//Local variable : any variable written inside of the method is known as local variable.
	
	// Declare variable: not assign the value
	static int c;
	
	//Declare and Assign
	static int d = 0;
	
	String name="Islam"; // Global variable non static
	static String name2="James"; // Global variable with static
	
	public static void main(String[] args) {
		UseVariable obj = new UseVariable();
		System.out.println(UseVariable.age); // This good approach
		
		int price=80;
		System.out.println(price);
		price=100; // reassign value
		System.out.println(price);
		
		UseVariable.c=20;
		System.out.println(UseVariable.c);
		UseVariable.c=40;
		System.out.println(UseVariable.c);
		System.out.println("My name is "+obj.name);
		System.out.println("Next name is "+obj.name2);
	}
	// to call Any property : variable /Method
	// Create object then call by the object name
	// If you use static then you must have to call by class name
	

}
