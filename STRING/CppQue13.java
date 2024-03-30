//C++ String: Exercises, Practice, Solution
/*13. Write a C++ program to change the case (lower to upper and upper to lower cases) of each character in a given string.
Example:
Sample Input: Pythpn
Sample Output: pYTHON*/
import java.util.*;
public class CppQue13
{
	public static void main(String[] args)
	{
		String s="Python";
		System.out.print(check(s));
	}
	public static String check(String s)
	{
		
			String str=s.toUpperCase();
			char[] arr=str.toCharArray();
			arr[0]=Character.toLowerCase(arr[0]);
		
		return String.valueOf(arr);
	}
}