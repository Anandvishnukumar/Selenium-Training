package Week1.day3;

public class ReverseOddWords {

	public static void main(String[] args) {
		String text = "My Name is Arnold Johnson Aaamber";
		String reverse[] = text.split(" ");

		for (int i = 0; i < reverse.length; i++) {
			if (i % 2 == 0) {
				System.out.print(reverse[i] + " ");
			} else {
				String newWord = "";
				char[] word = reverse[i].toCharArray();
				for (int j = word.length - 1; j >= 0; j--) {
					newWord = newWord + word[j];
				}
				System.out.print(newWord + " ");
			}
		}

	}

}