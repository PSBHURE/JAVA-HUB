//C++ String: Exercises, Practice, Solution
/*4. Write a C++ program to find the largest word in a given string.
Example:
Sample Input: C++ is a general-purpose programming language.
Sample Output: programming*/
import java.util.*;
public class CppQue4
{
	public static void main(String[] args)
	{
		String s="C++ is a general-purpose programming language";
		System.out.print(check(s));
		
	}
	public static String check(String s)
	{
		int max=0;
		String temp="\0";
		String[] arr=s.split("\\s+");
		for(int i=0;i<arr.length;i++)
		{
			int l=arr[i].length();
			if(l>max)
			{
				max=l;
				temp=arr[i];
			}				
		}
		return temp;
	}
}