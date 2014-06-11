package practicecode.com;

import java.util.Scanner;

public class IsPrime {
	public static boolean isPrime(int number) {
		boolean result = true;
		//dividing number from 2 to less than half of its value 
		for (int i = 2; i <= number / 2; i++) { 
			if (number % i == 0) { 
				result = false; // number is prime exit
				break;
			}
		}
		return result; // if number is prime result would be true
	}

	public static void main(String[] args) {
		for (int i = 3; i <= Integer.MAX_VALUE; i++) { // will give range of numbers
			boolean result = isPrime(i); // find out if number is prime
			if (result) {
				System.out.println(i); // print the prime number
			}
		}
	}

}
