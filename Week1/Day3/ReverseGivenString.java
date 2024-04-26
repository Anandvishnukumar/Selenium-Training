package Week1.day3;

public class ReverseGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name ="Test Leaf";

char[] ch=  name.toCharArray();
for(int i=ch.length-1; i>=0;i--)
{
		System.out.print(ch[i]);
}

	}

}
