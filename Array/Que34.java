/*
34. Write a Java program to find the length of the longest consecutive elements sequence from an unsorted array of integers.
Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5. 
*/
import java.util.*;
public class Que34
{
	public static void main(String[] args)
	{
		int[] arr={49, 1, 3, 200,6, 2, 4, 70, 5};
		System.out.println("longestCosecativeElement="+CosecativeElement(arr));
	}
	public static int CosecativeElement(int[] arr)
	{
		int mainCount=0,count=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++)
		{
			if((arr[i+1]-arr[i])==1)
				count++;
			if((arr[i+1]-arr[i])!=1)
			{
				if(count>=mainCount)
				mainCount=count;
				count=0;
			}
		}
		return mainCount+1;
	}
}