/*Find a peak element which is not smaller than its neighbours
Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array.

Note: If the array is increasing then just print the last element will be the maximum value.

Example:

Input: array[]= {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

Input: array[] = {10, 20, 15, 2, 23, 90, 67}
Output: 20 or 90
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.*/


import java.util.*;
public class GFG_ARRAY_TOP1
{
	public static void main(String[] args)
	{
		int[] arr= {10, 20, 15, 2, 23, 90, 67};//{5, 10, 20, 15};
		int[] arr1=check(arr);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}
	public static int[] check(int[] arr)
	{
		List<Integer>list=new ArrayList<>();
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
			list.add(arr[i]);
		}
		int[] arr1=new int[list.size()];
		for(int j=0;j<arr1.length;j++)
		{
			arr1[j]=list.get(j);
		}
		return arr1;
	}
}