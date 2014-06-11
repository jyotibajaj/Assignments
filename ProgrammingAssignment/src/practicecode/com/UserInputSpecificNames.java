package practicecode.com;

import java.util.Scanner;

public class UserInputSpecificNames {

	public String name;
	
		public static void main(String[] args) {
			UserInputSpecificNames name1 = new UserInputSpecificNames(); 
			Scanner s = new Scanner(System.in); // wait for the user input
			System.out.println("Enter the name:");
			String userName = s.next();
			if(userName.equals("Alice") || userName.equals("Bob")){
				System.out.println("hello " + userName);
			 
		}

	}

}
