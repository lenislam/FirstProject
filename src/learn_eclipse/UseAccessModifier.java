package learn_eclipse;

public class UseAccessModifier {
	
	//AccessModifier / Access specifier : where you can access and where you can not access.
	//public
	//private
	//protected
	//default
	
	//type main =====> Ctrl+space button ===>Hit enter    Mac : command + space button
	// sout =====> Ctrl+space button ===>Hit enter
	
	public static void main(String[] args) {
		
		System.out.println();
	}
	
	private void display() {
		
		System.out.println("Display");
	}
	
	public static void TvDisplay() { // if we use static then call with the class name
		
		System.out.println("TV Dispaly");
	}
	
	protected static void mobileDisplay() {
		
		System.out.println("Mobile Display");
	}
	
}
