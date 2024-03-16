/*24. Write a Java program to find a missing number 
in an array.*/
import java.util.*;
public class Que24
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,5,6,7,8,9,10};
		System.out.println(FindMissingNo(arr));
	}
	public static double FindMissingNo(int[] arr)
	{		
		int actual=0,ideal=0,n=0;
		for(int i:arr)
		{
		actual+=i;	
		}
		n=arr.length+1;
		ideal=n*(n+1)/2;
		return ideal-actual;
		
	}
}