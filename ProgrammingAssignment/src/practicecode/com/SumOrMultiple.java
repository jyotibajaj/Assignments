package practicecode.com;

import java.util.Scanner;



public class SumOrMultiple {
	
	public static int inputNumber;
	public static String inputChoice;

	public static void UserInput(){
		Scanner s = new Scanner(System.in);
	      inputNumber = s.nextInt();
	      
	      System.out.println("What do you want?");
	      Scanner s1 = new Scanner(System.in);
	      inputChoice =  s1.nextLine();
	      if(inputChoice.equals("Sum:")){
	    	  int computeSum = inputNumber*(inputNumber +1)/2;
	    	  System.out.println(computeSum);
	    	  
	      }
	       
	      else if(inputChoice.equals("mul:")){
	    	  int computeMultiple = 1;
	    	  for(int i = inputNumber; i>=1; i--){
	    		  computeMultiple  = computeMultiple * i;
	    		  
	    	  }
	    	  System.out.println(computeMultiple);
	    	  
	      }
		
		
		
	}
	public static void main(String[] args) {
		UserInput();

	}

}
