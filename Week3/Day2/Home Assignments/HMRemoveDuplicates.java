package Week3.day2;

import java.util.HashSet;
import java.util.Set;

public class HMRemoveDuplicates {

	public static void main(String[] args) {
		String s = "PayPal India";

		String Sample = s.toLowerCase();
		char[] arr = Sample.toCharArray();

		Set<Character> charset = new HashSet<Character>();
		Set<Character> dupcharset = new HashSet<Character>();

		// Splitting duplicate values to dupcharset
		for (int i = 0; i < arr.length; i++) {
			if (charset.contains(arr[i])) {
				dupcharset.add(arr[i]);

			} else {
				charset.add(arr[i]);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (dupcharset.contains(arr[i]) == charset.contains(arr[i])) {
				charset.remove(arr[i]);
			}
		}

		// checking for empty space
		charset.remove(' ');
		dupcharset.remove(' ');

		// Printing the duplicate values
		System.out.println("The Duplicate letters are : "+dupcharset);

		// Printing the unique values
		System.out.println("The Unique Letter are : "+charset);

	}

}