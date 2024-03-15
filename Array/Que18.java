/*18. Write a Java program to find the second 
smallest element in an array.*/
 import java.util.*;
public class Que18
{
	public static void main(String[] args)
	{
		int[] arr1={50,20,30,10,40};
		
		System.out.print("Second smallest element="+SecondSmallestElement( arr1));
	}
	public static int SecondSmallestElement(int[] arr)
	{
		Arrays.sort(arr);
		return arr[1];
	}
}