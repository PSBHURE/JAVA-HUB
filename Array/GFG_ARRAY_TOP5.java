//kth max and kth min element of an array

import java.util.*;
public class GFG_ARRAY_TOP5
{
	public static void main(String[] args)
	{
		int[] arr= {10, 20, 15, 2, 23, 90, 67};//{5, 10, 20, 15};
		int[] arr1=check(arr,3);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}
	public static int[] check(int[] arr,int k)
	{
		Arrays.sort(arr);
		int[] arr1=new int[2];
		arr1[0]=arr[k-1];
		arr1[1]=arr[arr.length-k];
		return arr1;
	}
}