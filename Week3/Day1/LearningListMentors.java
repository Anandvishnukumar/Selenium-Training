package Week3.Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LearningListMentors {
	
	public static void main(String[] args) {
		
		List<String> mentors=new ArrayList<String>();

		mentors.add("DDDD");

		mentors.add("AAAAA");
		mentors.add("BBBB");
		mentors.add("CCCC");
		mentors.add("EEEE");
		mentors.add("eeee");
		mentors.add("aaaa");
		mentors.add("bbbb");

		
		System.out.println("Mentors List" + mentors);
		
		mentors.add("FFFF");
		System.out.println("Mentors List after adding" + mentors);
		
		mentors.add(5, "cccc");
		System.out.println("Mentors List after adding using Index" + mentors);

		mentors.remove(7);
		System.out.println("Mentors List after removing using Index" + mentors);

		
		String MI=mentors.get(3);
		System.out.println("Mentors on the particular Index : " + MI);

		boolean con = mentors.contains("bb");
		System.out.println("Contains partial  " + con);
	
		boolean con1 = mentors.contains("bbbb");
		System.out.println("Contains full word   " + con1);
		
		Collections.sort(mentors);
		System.out.println("After Sorting " +mentors );
	
for(int i=0 ; i<=mentors.size();i++) {
	String value =mentors.get(i);
System.out.println(value);


}


	}
	}

}
