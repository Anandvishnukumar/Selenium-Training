package Week1.day3;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String words = "We learn java basics as part of java sessions in java week1";
		String[] arrtext=words.split(" ");
		for (int i=0; i<arrtext.length; i++) {
			for (int j=i+1; j<arrtext.length; j++) {
				if(arrtext[i].equals (arrtext[j])) {
					arrtext[j]="";
				}
				}
			}
		String out="";
		for(int k=0;k<arrtext.length;k++) {
			out=out+arrtext[k]+" ";
		}
		System.out.println(out);
		}
	
	}