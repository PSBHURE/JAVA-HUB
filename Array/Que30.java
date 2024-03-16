/*30. Write a Java program to check if an array of
 integers is without 0 and -1.*/
 import java.util.*;
  public class Que30
 {
	public static void main(String[] args)
	{
		int[] arr={50,77,12,54,-11};
		System.out.print(CheckArray(arr));
	}
	public static boolean CheckArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0 || arr[i]==-1)
			return false;
		}
		return true;
	}
 }