//C++ String: Exercises, Practice, Solution
/*Write a C++ program to sort characters (numbers and punctuation symbols are not included) in a string.
Example:
Sample Input: python
Sample Output: hnopty*/
import java.util.*;
public class CppQue5
{
	public static void main(String[] args)
	{
		String s="python";
		System.out.print(check(s));
		
	}
	public static String check(String s)
	{
		char[] arr=s.toCharArray();
		Arrays.sort(arr);
		return String.valueOf(arr);
	}
}