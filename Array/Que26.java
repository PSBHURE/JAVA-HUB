/*26. Write a Java program to move all 0's to the 
end of an array. Maintain the relative order of the
 other (non-zero) array elements.*/
 import java.util.*;
 public class Que26
 {
	public static void main(String[] args)
	{
		int[] arr={0,0,1,0,3,0,5,0,6};
		int[] arr1=TrailingZeros(arr);
		System.out.println(Arrays.toString(arr1));
	}
	public static int[] TrailingZeros(int[] arr)
	{
		int prev=0,next=0,temp=0;
		while(next<arr.length)
		{
			if(arr[next]!=0)
			{
				temp=arr[prev];
				arr[prev]=arr[next];
				arr[next]=temp;
				prev++;
			}
			next++;
		}
		return arr;
	}
 }