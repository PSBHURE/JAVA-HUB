/*Count pairs with given sum
Last Updated : 13 Apr, 2024
Given an array of N integers, and an integer K, the task is to find the number of pairs of integers in the array whose sum is equal to K.

Examples:  

Input: arr[] = {1, 5, 7, -1}, K = 6
Output:  2
Explanation: Pairs with sum 6 are (1, 5) and (7, -1).

Input: arr[] = {1, 5, 7, -1, 5}, K = 6
Output:  3
Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).         

Input: arr[] = {1, 1, 1, 1}, K = 2
Output:  6
Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1).

Input: arr[] = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1}, K = 11
Output:  9
Explanation: Pairs with sum 11 are (10, 1), (10, 1), (10, 1), (12, -1), (10, 1), (10, 1), (10, 1), (7, 4), (6, 5).*/

import java.util.*;
public class GFG_ARRAY_TOP13
{
	public static void main(String[] args)
	{
		int[] arr={10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
		int	k = 11;
		System.out.print(check(arr,k));
	}
	public static int check(int[] arr,int k)
	{
		Arrays.sort(arr);
		int left=0,right=arr.length-1,count=0;
		while(left<right)
		{
			if((arr[left]+arr[right])==k)
			{
				
				count++;
				//left duplicate
				int leftduplicate=left+1;
				while(leftduplicate<right && arr[left]==arr[leftduplicate])
				{
					count++;
					leftduplicate++;
				}
				//right duplicate
				int rightduplicate=right-1;
				while(rightduplicate>left && arr[right]==arr[rightduplicate])
				{
					count++;
					rightduplicate--;
				}
				right--;
				left++;
			}
			
			
			
			else if((arr[left]+arr[right])>k)
			right--;
			
			else if((arr[left]+arr[right])<k)
			left++;
		}
		return count;
	}
}