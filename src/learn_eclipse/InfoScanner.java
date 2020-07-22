package learn_eclipse;

import java.util.Scanner;

public class InfoScanner {
	
	// Scanner = Scanner is class from JDK which take input from user.

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = input.nextLine();
		System.out.println("My name is "+name);
		
		System.out.println("Enter your ID");
		int id =input.nextInt();
		System.out.println("My ID is" +id);
		
		System.out.println("Yes present in class");
		boolean isPresent=input.nextBoolean();
		System.out.println("Student is present"+isPresent);
		
		// close scanner object
		input.close();
	}

}
