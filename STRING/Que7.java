//Write a Java program to concatenate a given string to the end of another string.
import java.util.*;
public class Que7
{
	public static void main(String[] args)
	{
		String s1="Hello world";
		String s2="hello World";
		System.out.print(check(s1,s2));
	}
	public static String check(String s1,String s2)
	{
		StringBuffer str=new StringBuffer();
		str.append(s1).append(s2);
		return String.join(" ",str);
	}
}