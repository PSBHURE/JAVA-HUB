//8. Write a Java program to copy an array by iterating the array.
import java.util.*;
public class Que8
{
	public static void main(String[] args)
	{
		int[] arr1={10,20,30,40,50};
		int[] arr2=ArrayCopy(arr1);
		for(int i=0;i<arr2.length;i++)
		{
		System.out.print(arr2[i]+" ");
		}
	}
	public static int[] ArrayCopy(int[] arr)
	{
		int[] arr1=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}
		return arr1;
	}
}