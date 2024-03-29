//C++ String: Exercises, Practice, Solution
/*Write a C++ program to change every letter in a given string with the letter following it in the alphabet (i.e. a becomes b, p becomes q, z becomes a).
Example:
Sample Input: w3resource
Sample Output: x3sftpvsdf*/
import java.util.*;
public class CppQue2
{
	public static void main(String[] args)
	{
		String s="w3resource";
		System.out.print(check(s));
	}
	public static String check(String s)
	{
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			char base=Character.isLowerCase(arr[i])?'a':'A';
			if(arr[i]>=97 && arr[i]<=122 )
			arr[i]=(char)(base+(arr[i]-base+1)%26);
		}
		return String.valueOf(arr);
	}
}