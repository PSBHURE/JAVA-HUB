/*Find Subarray with given sum | Set 1 (Non-negative Numbers)
Last Updated : 22 Dec, 2023
Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum.

Note: There may be more than one subarray with sum as the given sum, print first such subarray. 

Examples: 

Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output: Sum found between indexes 2 and 4
Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33

Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
Output: Sum found between indexes 1 and 4
Explanation: Sum of elements between indices 1 and 4 is 4 + 0 + 0 + 3 = 7

Input: arr[] = {1, 4}, sum = 0
Output: No subarray found
Explanation: There is no subarray with 0 sum*/

import java.util.*;
public class GFG_ARRAY_TOP8
{
	public static void main(String[] args)
	{
		int[] arr={1, 4, 20, 3, 10, 5};
		int target = 33;
		int[] arr1=function(arr,target);
		for(int x:arr1)
		{
			System.out.print(x+" ");
		}
	}
	
	public static int[] function(int[] arr,int target)
	{
		int sum=0,left=0,right=0;
		int[] arr1=new int[2];
		arr1[0]=-1;
		arr1[1]=-1;
		while(right<arr.length)
		{
			if(sum<target)
			{
				sum+=arr[right];
				right++;
			}
			else if(sum>target)
			{
				sum-=arr[left];
				left++;
			}
			else if(sum==target)
			{
				arr1[0]=left;
				arr1[1]=right-1;
				break;
			}
		}
		return arr1;
		
	}
}