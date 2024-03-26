//Write a Java program to get the character (Unicode code point) before the specified index within the string.
import java.util.*;
public class Que3
{
	public static void main(String[] args)
	{
		String s="Hello world";
		System.out.print(check(s,10));
	}
	public static char check(String s,int i)
	{
		return s.charAt(i-1);
	}
}