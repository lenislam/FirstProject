package learn_eclipse;

public class InfoNestedClass {
	//Parent class
	
	public static void main(String[] args) {
	//baby food = new baby();
		System.out.println(Baby.carPrice);
		Baby.carPrice=60000; // re-assign 
		System.out.println(Baby.carPrice);
		System.out.println(son.newvalue);
		System.out.println(son.value);
	}

	public static class Baby{ // nested class is static and call the variable is also static
		// nested class
		
		static int carPrice = 50000;
	}
	
	public static class son{
		
		static double value = 50.45;
		static int newvalue=(int)value;
		static int a =400;
	}
}
