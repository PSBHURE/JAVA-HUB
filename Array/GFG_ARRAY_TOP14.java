/*Find duplicates in O(n) time and O(1) extra space | Set 1
Last Updated : 16 Apr, 2024
Given an array of n elements that contains elements from 0 to n-1, with any of these numbers appearing any number of times. Find these repeating numbers in O(n) and use only constant memory space.

Note: The repeating element should be printed only once.

Example: 

Input: n=7 , array[]={1, 2, 3, 6, 3, 6, 1}
Output: 1, 3, 6
Explanation: The numbers 1 , 3 and 6 appears more than once in the array.

Input : n = 5 and array[] = {1, 2, 3, 4 ,3}
Output: 3
Explanation: The number 3 appears more than once in the array.*/


import java.util.*;
public class GFG_ARRAY_TOP14
{
	public static void main(String[] args)
	{
		int[] arr={1, 2, 3, 6, 3, 6, 1};
		int[] arr1=(check(arr));
		for(int x:arr1)
		{
			System.out.print(x+" ");
		}
	}
	
	public static int[] check(int[] arr)
	{
		List<Integer>list=new ArrayList<>();
		Map<Integer,Integer>map=new HashMap<>();
		for(int x:arr)
		{
			map.put(x,map.getOrDefault(x,0)+1);
		}
		for(Map.Entry<Integer,Integer>entry:map.entrySet())
		{
			if(entry.getValue()>1)
			list.add(entry.getKey());
		}
		int[] arr1=new int[list.size()];
		int i=0;
		for(int ch:list)
		{
			arr1[i]=ch;
			i++;
		}
		return arr1;
	}
}