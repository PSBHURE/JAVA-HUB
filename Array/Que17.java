/*17. Write a Java program to find the second largest
 element in an array.*/
 import java.util.*;
public class Que17
{
	public static void main(String[] args)
	{
		int[] arr1={50,20,30,10,40};
		
		System.out.print("Second largest element="+SecondLargestElement( arr1));
	}
	public static int SecondLargestElement(int[] arr)
	{
		Arrays.sort(arr);
		return arr[arr.length-1-1];
	}
}