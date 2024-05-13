package Week3.Day1;

import java.util.Arrays;

public class HAArrayFindSecLar {

	public static void main(String[] args) {

		int[] myArray =  { 2000,3, 2, 11, 4, 6, 7, 9, 99, 88,999,1000 };
		int length = myArray.length;

		System.out.println("Total Value in Array " + length);

		Arrays.sort(myArray);
		System.out.println("The largest value : " + myArray[myArray.length - 1]);
      	System.out.println("second largest value : " + myArray[myArray.length - 2]);

	}

}
