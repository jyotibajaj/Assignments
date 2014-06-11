package practicecode.com;

import java.util.Scanner;

public class SumOrMultiple {

	public static int inputNumber;
	public static String inputChoice;
	private static final String ASK_USER = "What do you want?";
	private static final String SUM = "Sum:";
	private static final String MUL = "mul:";
	private static final String Number = "Enter Number:";

	public static int userInput() {
		System.out.println(Number);
		Scanner s = new Scanner(System.in);
		inputNumber = s.nextInt();
		System.out.println(ASK_USER);
		Scanner s1 = new Scanner(System.in);
		inputChoice = s1.nextLine();
		int result = 0;
		if (inputChoice.equals(SUM)) {
			int computeSum = inputNumber * (inputNumber + 1) / 2;
			result = computeSum;
			//System.out.println("Sum is4");
		}

		else if (inputChoice.equals(MUL)) {
			int computeMultiple = 1;
			for (int i = inputNumber; i >= 1; i--) {
				computeMultiple = computeMultiple * i;

			}
			result = computeMultiple;
			// System.out.println(computeMultiple);

		}
		return result;

	}

	public static void main(String[] args) {
		System.out.println("start");
		int result = userInput();
		System.out.println(result);

	}

}
