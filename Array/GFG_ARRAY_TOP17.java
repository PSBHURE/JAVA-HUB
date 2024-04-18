/*Find the first repeating element in an array of integers
Last Updated : 06 Jul, 2023
Given an array of integers arr[], The task is to find the index of first repeating element in it i.e. the element that occurs more than once and whose index of the first occurrence is the smallest. 

Examples: 

Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
Output: 5 
Explanation: 5 is the first element that repeats

Input: arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10}
Output: 6 
Explanation: 6 is the first element that repeats*/


import java.util.*;
public class GFG_ARRAY_TOP17
{
	public static void main(String[] args)
	{
		int[] arr= {6, 10, 5, 4, 9, 120, 4, 6, 10};
		System.out.print(check(arr));
	}
	
	public static int check(int[] arr)
	{
		Map<Integer,Integer>map=new LinkedHashMap<>();
		for(int x:arr)
		{
			map.put(x,map.getOrDefault(x,0)+1);
		}
		
		for(Map.Entry<Integer,Integer>entry:map.entrySet())
		{
			if(entry.getValue()>1)
			return entry.getKey();
		}
		return -1;
	}
}