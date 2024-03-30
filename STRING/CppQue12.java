//C++ String: Exercises, Practice, Solution
/*12. Write a C++ program to insert a dash character (-) between two odd numbers in a given string of numbers.
Example:
Sample Input: 1345789
Sample Output: Result-> 1-345-789*/
import java.util.*;
public class CppQue12
{
	public static void main(String[] args)
	{
		String s="1345789";
		System.out.print(check(s));
	}
	public static String check(String s)
	{
		StringBuffer temp=new StringBuffer();
		for(int i=0;i<s.length()-1;i++)
		{
			int j=i+1;
			temp.append(s.charAt(i));
			String str1=String.valueOf(s.charAt(i));
			String str2=String.valueOf(s.charAt(j));
			if(Integer.parseInt(str1)%2==1 && Integer.parseInt(str2)%2==1)
			temp.append("-");
			if(j==s.length()-1)
			temp.append(s.charAt(j));
		}
		return new String(temp);
	}
}