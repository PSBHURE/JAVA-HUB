//max and min element in an array

import java.util.*;
public class GFG_ARRAY_TOP2
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
		Arrays.sort(arr);
		int[] arr1=new int[2];
		arr1[0]=arr[0];
		arr1[1]=arr[arr.length-1];
		return arr1;
	}
}