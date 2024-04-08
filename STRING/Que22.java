/*22. Write a C++ program to remove all special characters from a given string.
Example:
Original string: abcd $ js# @acde$
New string after removing the special characters from the said string:
abcd js acde*/
import java.util.*;
public class Que22
{
	public static void main(String[] args)
	{
		String str=" abcd $ js# @acde$";
		System.out.println(check(str));
	}
	public static String check(String str1)
	{
		String str=str1.trim();
		StringBuffer temp=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(str.charAt(i)) || Character.isSpace(str.charAt(i)))
			temp.append(str.charAt(i));
		}
		return new String(temp);
	}
}
