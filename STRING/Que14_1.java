/*14. Write a C++ program to find the numbers in a given string and calculate the sum of all numbers.
Example:
Sample Input: w3resource from 2008
Sample Output: Sum of the numbers: 2011*/

import java.util.*;
public class Que14_1
{
	public static void main(String[] args)
	{
		String str="w3resource from 2008";
		System.out.println(check(str));
	}
	public static int check(String str)
	{
		List<String>list=new ArrayList<>();
		StringBuffer temp=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
			temp.append(ch);
			while((i+1)<str.length() && Character.isDigit(str.charAt(i+1)))
			{
				temp.append(str.charAt(++i));
			}
			if(temp.length()>0)
			{
				list.add(new String(temp));
				temp.setLength(0);
			}
		}
		int sum=0;
		for(String x:list)
		{
			sum=sum+Integer.parseInt(x);
		}
		return sum;
	}
}