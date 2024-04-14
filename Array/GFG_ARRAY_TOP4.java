

import java.util.*;
public class GFG_ARRAY_TOP4
{
	public static void main(String[] args)
	{
		int[] arr={4,6,2,3,1};
		int[] arr1=function(arr);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}
	public static int[] function(int[] arr)
	{
		Arrays.sort(arr);
		return arr;
	}
}