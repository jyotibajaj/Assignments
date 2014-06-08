package practicecode.com;

import java.util.Scanner;

public class findPrime {
	public static void findPrimeNumber() {
		System.out.println("Enter Number:");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				System.out.println("Number is not prime");
				return;
			}
		}

		System.out.println("Number is prime.");
	}

	public static void main(String[] args) {
		findPrimeNumber();

	}

}
