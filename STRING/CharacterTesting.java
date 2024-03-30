import java.util.*;
public class CharacterTesting
{
	public static void main(String[] args)
	{
		String str="w3ReSoucE } IS @ BesT ! praCtice # questiOn > proVider ?";
		check(str);
	}
	public static void check(String str)
	{
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isLetter(arr[i]))
			System.out.println(arr[i]+"=>is a character");
			else if(Character.isDigit(arr[i]))
			System.out.println(arr[i]+"=>is a digit");
			else if(Character.isSpace(arr[i]))
			System.out.println(arr[i]+"=>is a wide spcae");
			else
			System.out.println(arr[i]+"=>is a special symbol");
		}
	}
}