/*Count number of occurrences (or frequency) in a sorted array
Last Updated : 20 Dec, 2023
Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[]. Expected time complexity is O(Logn) 

Examples: 
  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
  Output: 4 // x (or 2) occurs 4 times in arr[]
  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 3
  Output: 1 
  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 1
  Output: 2 
  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 4
  Output: -1 // 4 doesn't occur in arr[] 
*/

import java.util.*;
public class GFG_ARRAY_TOP6
{
	public static void main(String[] args)
	{
		int[] arr= {1, 1, 2, 2, 2, 2, 3,3,3};
		Map<Integer,Integer>map=function(arr,2);
		for(Map.Entry<Integer,Integer>entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
	}
	public static Map<Integer,Integer> function(int[] arr,int find)
	{
		Map<Integer,Integer>map=new HashMap<>();
		for(int x:arr)
		{
			if(x==find)
			map.put(x,map.getOrDefault(x,0)+1);
		}
		return map;
	}
}