/*Program to cyclically rotate an array by one
Last Updated : 11 Sep, 2023
Given an array, the task is to cyclically rotate the array clockwise by one time. 

Examples:  

Input: arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}

Input: arr[] = {2, 3, 4, 5, 1}
Output: {1, 2, 3, 4, 5}*/

import java.util.*;
public class GFG_ARRAY_TOP11
{
	public static void main(String[] args)
	{
		int[] arr={1, 2, 3, 4, 5};
		int[] arr1=check(arr);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}
	public static int[] check(int[] arr)
	{
		int[] arr1=new int[arr.length];
		int temp=arr[arr.length-1];
		for(int i=arr1.length-2;i>=0;i--)
		{
			arr1[i+1]=arr[i];
		}
		arr1[0]=temp;
		return arr1;
	}
}

