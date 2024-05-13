package Week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HMPrintUniqueCharacter {

	public static void main(String[] args) {

		String name = "anand";
		

		char arr[]= name.toCharArray();
		
		Set<Character> unique_name= new HashSet<Character>();
		
		for(int i =0;i<arr.length;i++)
		{
			if(unique_name.contains(arr[i]))
			{
				unique_name.remove(arr[i]);
			}
			else
			{
				unique_name.add(arr[i]);
			}
		}
		
		System.out.println(unique_name);
		
	}

}