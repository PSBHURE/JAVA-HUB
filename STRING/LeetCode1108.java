/*
1108. Defanging an IP Address
Easy

2038

1745

Add to List

Share
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

 

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
*/
import java.util.*;
public class LeetCode1108
{
	public static void main(String[] args)
	{
		String str="255.100.50.0";
		System.out.print(StringManipulation(str));
	}
	public static String StringManipulation(String str)
	{
		String[] arr=str.split("\\.");
		StringBuffer temp=new  StringBuffer();
		for(int i=0;i<arr.length;i++)
		{
			temp.append(arr[i]);
			if(i<arr.length-1)
			temp.append("[.]");
		}
		return new String(temp);
	}
}