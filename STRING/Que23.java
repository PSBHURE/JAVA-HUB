/*23. Write a C++ program that counts the number of unique characters in two given strings.
Example:
Original Strings:
String1: Python
String2: Java
Total number of unique characters of the said two strings: 9*/

import java.util.*;
public class Que23
{
	public static void main(String[] args)
	{
		String s1="Python",s2="Java";
		System.out.print(check(s1,s2));
	}
	public static int check(String s1,String s2)
	{
		Set<Character>set=new HashSet<>();
		for(int i=0;i<s1.length();i++)
		{
			set.add(s1.charAt(i));
		}
		for(int j=0;j<s2.length();j++)
		{
			set.add(s2.charAt(j));
		}
		return set.size();
	}
}