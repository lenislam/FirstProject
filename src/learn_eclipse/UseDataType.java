package learn_eclipse;

public class UseDataType {
	
	// Data Type:
	//Primitive data type
	/**
	 * Intrigal:
	 * byte
	 * short
	 * int
	 * long
	 * Floating:
	 * float
	 * double
	 * 
	 * char
	 * 
	 * boolean = boolean data type is true or false.
	 */
	
	boolean isPizzaAvailable=true;
	boolean isAllowed=false;// 1 bit
	
	char nameStartWith='S'; // 16 bit
	
	byte number=20; // 8 bit 127
	int age =35; //32 bit 2147483647
	short price=50; // 16 bit
	long budget=9079686696090945450L; // 64 bit
	
	float salary=5000.500f; // 32 bit 7 decimal digit
	double courseFee=4500.20; // 64 bit 16 decimal digit
	
	
	//Non primitive data type:
	/**
	 * Strings
	 * Objects
	 * Arrays
	 */
	String name="Mujahid";
	
	public static void main(String[] args) {
		
		// why object need to create?
		//To call the property from any class
		//Syntax of the object:classname objectName=new ConstructorOfClass();
		
	UseDataType obj = new UseDataType();
	// . is used to create a relationship
	
	// Call the property object name
	//obj.age=20;
	System.out.println(obj.age);
	System.out.println(obj.courseFee);
	System.out.println(obj.name);
	System.out.println(obj.age);
	
	}

}
