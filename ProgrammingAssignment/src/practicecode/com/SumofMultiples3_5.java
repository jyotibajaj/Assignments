package practicecode.com;

public class SumofMultiples3_5 {
	private static final String MSG = "Sum of multiples: ";

	public static int multipleSum(int number) {
		int sum = 0;
		for (int i = number; i >= 3; i--) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}

		}

		return sum;

	}

	public static void main(String[] args) {

		int result = multipleSum(9);
		System.out.println(MSG + result);

	}

}
