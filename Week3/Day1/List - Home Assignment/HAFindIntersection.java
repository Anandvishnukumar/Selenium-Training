package Week3.Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HAFindIntersection {

	public static void main(String[] args) {

		int[] array1 = { 8,10,12,2,4 };
		int[] array2 = { 8,10,12,2,4 ,12,8,6 };

		List<Integer> val1 = new ArrayList<Integer>();
		for (Integer i : array1) {
			val1.add(i);

		}
		Collections.sort(val1);

List<Integer> val2=new ArrayList<Integer>();
for (Integer j : array2) {
	val2.add(j);
	Collections.sort(val2);

}
for (int a = 0; a < array1.length; a++) {

	for (int b = 0; b < array2.length; b++) {


		if(val1.get(a)==val2.get(b))
		{
			System.out.println("The Comman Values in 2 arrays: "+val2.get(b));
		}
	}
	}

	}
	}
