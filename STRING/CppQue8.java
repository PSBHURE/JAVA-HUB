//C++ String: Exercises, Practice, Solution
/*Write a C++ program to count all the words in a given string.
Example:
Sample Input: Python
Sample Output: number of words -> 1*/
import java.util.*;
public class CppQue8
{
	public static void main(String[] args)
	{
		String s="  hello world   ";
		System.out.print(check(s));
		
	}
	public static int check(String s)
	{
		String str=s.trim();
		int count=0;
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==' ')
				count++;
		}
		return count+1;
	}
}