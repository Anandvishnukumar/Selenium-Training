package Week1.day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 4, 3, 2, 8, 5, 6, 7, 10 };

		Arrays.sort(numbers);

		for (int i = 0; i < numbers[numbers.length - 1]; i++) {

			if (i + 1 != numbers[i]) {
				int missing = i + 1;
				System.out.println(+missing);
				break;

			}
		}

	}
}
