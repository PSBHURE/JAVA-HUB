//C++ String: Exercises, Practice, Solution
/*6. Write a C++ program to check whether the characters e and g are separated by exactly 2 places anywhere in a given string at least once.
+ Example:
Sample Input: eagerer
Sample Output: eagerer -> 1*/
import java.util.*;
public class CppQue6
{
	public static void main(String[] args)
	{
		String s="eagerer";
		System.out.print(check(s));
		
	}
	public static int check(String s)
	{
		char[] arr=s.toCharArray();
		int count=0;
		for(int i=0;i<arr.length-2;i++)
		{
			int j=i+2;
			if((arr[i]=='e' && arr[j]=='g')||(arr[i]=='g' && arr[j]=='e'))
			count++;
		}
		return count;
	}
}