package practicecode.com;

import java.util.Scanner;

public class InputNumber {
	public int number;

	public int returnSum(int num) {
		int sum = 0;
		sum = num * (num + 1) / 2; // Sum numbers up to 10
		return sum;
	}

	public static void main(String[] args) {
		InputNumber num1 = new InputNumber();
		Scanner s = new Scanner(System.in); // wait for the user input
		System.out.println("Enter the number:");
		num1.number = s.nextInt();
		int result = num1.returnSum(num1.number);
		System.out.println(result);

	}

}
