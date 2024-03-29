//C++ String: Exercises, Practice, Solution
//1. Write a C++ program to reverse a given string.
import java.util.*;
public class CppQue1
{
	public static void main(String[] args)
	{
		String s="w3resource";
		System.out.print(check(s));
	}
	public static String check(String s)
	{
		char[] arr=s.toCharArray();
		int start=0,end=arr.length-1;
		char temp;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return String.valueOf(arr);
	}
}