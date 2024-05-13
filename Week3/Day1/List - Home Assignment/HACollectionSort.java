package Week3.Day1;

import java.util.ArrayList;
import java.util.Collections;

public class HACollectionSort {

	public static void main(String[] args) {

		ArrayList<String> array = new ArrayList<String>();
		
		array.add("Wipro");	
		array.add("BCTS");	
		array.add("TCS");	
		array.add("Infosys");	
		array.add("Aspire");	
		array.add("AAHY");
		
		
		System.out.println("Before Sorting : "+array);
		
		Collections.sort(array);
		
		System.out.println("After Sorting : "+array);

		
		
	}
			
	
}
