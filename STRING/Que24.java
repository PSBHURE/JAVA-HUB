/*24. Write a C++ program to count the number of duplicate characters in a given string.
Example:
Original String:
Total number of unique characters of the said two strings.
Number of duplicate characters in the said string: 36*/

import java.util.*;
public class Que24
{
	public static void main(String[] args)
	{
		String str="Total number of unique characters of the said two strings";
		System.out.print(check(str));
	}
	public static int check(String str)
	{
		Map<Character,Integer>map=new HashMap<>();
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			char ch=Character.toLowerCase(str.charAt(i));
			if(Character.isLetter(ch))
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		for(Map.Entry<Character,Integer>entry:map.entrySet())
		{
			if(entry.getValue()>1)
			count++;
		}
		return count;
		
		
	}
}