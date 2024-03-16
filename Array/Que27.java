/*27. Write a Java program to find the number of 
even and odd integers in a given array of integers.*/
import java.util.*;
 public class Que27
 {
	public static void main(String[] args)
	{
		int[] arr={5,7,2,4,9};
		System.out.println(FindEvenNo(arr));
	}
	public static int FindEvenNo(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			count++;
		}
		return count;
	}
 }