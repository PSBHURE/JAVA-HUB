//C++ String: Exercises, Practice, Solution
/*7. Write a C++ program to count all the vowels in a given string.
Example:
Sample Input: eagerer
Sample output: number of vowels -> 4*/
import java.util.*;
public class CppQue7
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
		for(int i=0;i<arr.length;i++)
		{
		
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
			count++;
		}
		return count;
	}
}