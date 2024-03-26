//Write a Java program to compare two strings lexicographically, ignoring case differences.
import java.util.*;
public class Que6
{
	public static void main(String[] args)
	{
		String s1="Hello world";
		String s2="hello World";
		System.out.print(check(s1,s2));
	}
	public static boolean check(String s1,String s2)
	{
		String str1=s1.toLowerCase();
		String str2=s2.toLowerCase();
		return str1.equals(str2);
	}
}