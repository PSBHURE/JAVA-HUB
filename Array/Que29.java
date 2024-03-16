/*29. Write a Java program to compute the average 
value of an array of integers except the largest 
and smallest values.*/
import java.util.*;
 public class Que29
 {
	public static void main(String[] args)
	{
		int[] arr={5,7,2,4,9};
		System.out.println(Average(arr));
	}
	public static double Average(int[] arr)
	{
		Arrays.sort(arr);
		int sum=0,count=0;
		for(int i=1;i<arr.length-1;i++)
		{
			sum+=arr[i];
			count++;
		}
		return (double)sum/count;
	}
 }