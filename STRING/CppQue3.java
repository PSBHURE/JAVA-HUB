//C++ String: Exercises, Practice, Solution
/*3. Write a C++ program to capitalize the first letter of each word in a given string. Words must be separated by only one space.
Example:
Sample Input: cpp string exercises
Sample Output: Cpp String Exercises*/
import java.util.*;
public class CppQue3
{
	public static void main(String[] args)
	{
		String s="cpp string exercises";
		System.out.print(check(s));
	}
	public static String check(String s)
	{
		String[] arr=s.split("\\s+");
		for(int i=0;i<arr.length;i++)
		{
			char[] arr1=arr[i].toCharArray();
			
			arr1[0]=Character.toUpperCase(arr1[0]);
			arr[i]=String.valueOf(arr1);
			
		}
		return String.join(" ",arr);
	}
}