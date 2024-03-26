//Get the character at the given index within the String
import java.util.*;
public class Que1
{
	public static void main(String[] args)
	{
		String s="Hello world";
		System.out.print(check(s,6));
	}
	public static char check(String s,int i)
	{
		return s.charAt(i);
	}
}