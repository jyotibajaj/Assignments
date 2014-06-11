package practicecode.com;

import java.util.Scanner;

public class UserInputName {

	public String name;
	private static final String NAME =  "Enter the name: ";
	private static final String GREET =  "hello ";

	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // wait for the user input
		System.out.println(NAME);
		String userName = s.next();
		System.out.println(GREET + userName);

	}

}
