/*28. Write a Java program to get the difference 
between the largest and smallest values in an array 
of integers. The array must have a length of at 
least 1.*/
import java.util.*;
 public class Que28
 {
	public static void main(String[] args)
	{
		int[] arr={5,7,2,4,9};
		System.out.print(Difference(arr));
	}
	public static int Difference(int[] arr)
	{
		Arrays.sort(arr);
		return arr[arr.length-1]-arr[0];
	}
 }