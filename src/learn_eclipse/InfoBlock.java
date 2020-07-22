package learn_eclipse;

public class InfoBlock {
	
	{// block start
		
		String name ="Mohammad";
		System.out.println(name);
				
	}// block end
	
	public void display() {
		
		String name = "Islam";
		System.out.println(name);
		
	}

	public static void main(String[] args) {
		
		InfoBlock mobile = new InfoBlock();
		// System.out.println(name);
		mobile.display();
	}
	// RULES
	// we can not print statement in main method because the variable create in block
	// so what do : we take printout from block but need to create an object inside main method
}
