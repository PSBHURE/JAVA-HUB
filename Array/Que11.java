/*11. Write a Java program to reverse an array of
 integer values.*/
import java.util.*;
public class Que11
{
	public static void main(String[] args)
	{
		int[] arr1={10,20,30,40,50};
		int[] arr2=ArrayReverse(arr1);
		for(int i=0;i<arr2.length;i++)
		{
		System.out.print(arr2[i]+" ");
		}
	}
	public static int[] ArrayReverse(int[] arr)
	{
		int temp=0;
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;
	}
}