//Write a Java program to create a String object with a character array.
import java.util.*;
public class Que11
{
	public static void main(String[] args)
	{
		char[] arr={'1','2','3','4'};
		System.out.println(check(arr));
	}
	public static String check(char[] arr)
	{
		return String.valueOf(arr);
	}
}