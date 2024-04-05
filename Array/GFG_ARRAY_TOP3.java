//reverse an array

import java.util.*;
public class GFG_ARRAY_TOP3
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
		int start=0,end=arr.length-1;
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;
	}
}