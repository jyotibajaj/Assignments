package practicecode.com;

import java.util.Scanner;

public class UserInputName {

	public String name;
	
//	public UserInputName(String name){
//		UserName = name;
//	}
		
		public static void main(String[] args) {
			UserInputName name1 = new UserInputName(); 
			Scanner s = new Scanner(System.in); // wait for the user input
			System.out.println("Enter the name:");
			String userName = s.next();
				System.out.println("hello " + userName);
			 
		}

	}


