/*Write a Java program to test if a given string contains the specified sequence of char values.

Sample Output:

Original String: PHP Exercises and Python Exercises                                                           
Specified sequence of char values: and                                                                        
true */
import java.util.*;
public class Que8
{
	public static void main(String[] args)
	{
		String s1="PHP Exercises and Python Exercises";
		String s2="and";
		System.out.print(check(s1,s2));
	}
	public static boolean check(String s1,String s2)
	{
		String[] str=s1.split("\\s+");
		List<String> list=new ArrayList<>();
		for(String word:str)
		{
			list.add(word);
		}
		if(list.contains(s2))
		return true;
		return false;
		
	}
}