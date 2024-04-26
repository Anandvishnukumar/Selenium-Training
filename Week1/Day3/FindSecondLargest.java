package Week1.day3;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {3,2,11,4,6,7};
		
		int length = data.length;
		Arrays.sort(data);
		
		
		for (int i=0; i< data.length;i++) {
			System.out.println(data[i]);
		}
		System.out.println("***********************");
		System.out.println("Second largets from list : "   +  data[length-2]);

	}

}
