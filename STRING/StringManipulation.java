import java.util.Scanner;
public class StringManipulation
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter string::");
		String str=scanner.nextLine();
		String lowercase="";
		String uppercase="";
		int mid=str.length()/2;
		for(int i=0;i<str.length();i++)
		{
			if(i<mid)
			lowercase=lowercase+Character.toLowerCase(str.charAt(i));
		else
			uppercase=uppercase+Character.toUpperCase(str.charAt(i));
		}
		System.out.println(lowercase+uppercase);
	}
}
//HELLO MY NAME IS PRATIK