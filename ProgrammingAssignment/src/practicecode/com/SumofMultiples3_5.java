package practicecode.com;

public class SumofMultiples3_5 {

	public static int multipleSum(int number) {
		int sum = 0;
		for (int i = number; i >= 3; i--) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}

		}
		System.out.println("Sum of multiples: " + sum);
		return sum;

	}

	public static void main(String[] args) {

		multipleSum(6);

	}

}
