import java.util.Scanner;

public class REVERSSTRING {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S;
		System.out.println("enter any string");
		S=sc.nextLine();
		String S1=ReversString(S);
		System.out.println(S);
		System.out.println(S1);

	}

	private static String ReversString(String s) {
		char[] c=s.toCharArray();
		int start=0;
		int end=s.length()-1;
		char temp;
		while(start<end)
		{
			temp=c[start];
			c[start]=c[end];
			c[end]=temp;
			start++;
			end--;
		}
		return new String(c);
	}

}
