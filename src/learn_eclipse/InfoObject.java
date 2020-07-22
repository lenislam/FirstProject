package learn_eclipse;

import learn_eclipse.test.*;
//import learn.test.TestOne;

public class InfoObject {

		// A class is a blueprint or pototype that defines the variable and the method commons to all objects of a certain kind.
	
	// An object is a specimen of a class.
	// software objects are often used to model real-world object you find in everyday life
	
	String phoneBrand = "Apple";
	int phonePrice = 1200;
	
	public void phoneDisplay() {
		
		System.out.println("Phone display size is 6 inch");
	}
	public void phoneInfo() {
		
		System.out.println("Phone brand is :"+phoneBrand+"price is : "+phonePrice);
	}
	
	public static void main(String[] args) {
		
		// Create object 
		// Object Syntax : className objectName = New ClassName();
		// We can call variable and method by objectName
		
		InfoObject phone = new InfoObject();
		System.out.println(phone.phoneBrand);
		phone.phoneDisplay();
		phone.phoneInfo();
		// can we create multiple object in same class - yes
		InfoObject lg = new InfoObject();
		lg.phoneBrand="LG";
		System.out.println(lg.phoneBrand);
		
		InfoObject nokia = new InfoObject();
		//nokia.phoneBrand= "Nokia";
		//System.out.println(nokia.phoneBrand); or
		System.out.println(nokia.phoneBrand="Nokia");
		
		// Can we create object of another class in this main method - yes
		InfoCasting calculate = new InfoCasting();
		
		TestOne anotherPackage=new TestOne();
		Demo demo = new Demo();
		
		phone.phoneBrand="Sumsang";
		System.out.println(phone.phoneBrand);
		UseDataType udt = new UseDataType();
		//udt.age;
		System.out.println(udt.age);
	}

}
