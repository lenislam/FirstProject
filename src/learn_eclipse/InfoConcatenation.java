package learn_eclipse;

public class InfoConcatenation {
	// one way : We make static then we can call it in main method.
	static String firstName="Mujahid"; // static variable
	static String lastName="Islam";
	static String studentId="30235";
	
	static String fullName=firstName+" "+lastName;
	
	String stName="Shohel"; //non static variable
	
	//Or other way without static we need create an object in main method then can call it.
	// To create an object =  classname object(name) = new ConstructorOfClass (class name)

	//	String firstName="Mujahid";
//	String lastName="Islam";
//	
//	String fullName=firstName+" "+lastName;

	public static void main(String[] args) {
		InfoConcatenation remote = new InfoConcatenation();
		
		System.out.println("My full name is"+" "+InfoConcatenation.fullName); // call by class name
		//System.out.println("My full name is "+ " "+ remote.fullName);
		System.out.println("Student ID with first name"+" :"+studentId+"_"+firstName);
		System.out.println(remote.stName);
		int x=35;
		int y=15;
		int plus=x+y;
		int mynus=x-y;
		int mynus1=y-x;
		int multiply=x*y;
		int division=x/y;
		double division1=x/y;
		
		System.out.println("Plus "+plus);
		System.out.println("Mynus "+mynus);
		System.out.println("Multiply "+multiply);
		System.out.println("Division "+division);
		System.out.println("Division1 "+division1);
		
		double a=10;
		double b=3;
		double division2=a/b;
		System.out.println("Division2 "+division2);
		
	}

}
