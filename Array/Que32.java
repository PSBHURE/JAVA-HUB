/*32. Write a Java program to check if an array of 
integers contains two specified elements 65 and 77.*/
 
 import java.util.*;
 public class Que32
 {
	public static void main(String[] args)
	{
		int[] arr={77,77,65,65,65,77};
		System.out.print(Check(arr));
	}
	public static boolean Check(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==65 || arr[i]==77)
			count++;
		}
		if(count>=2)
		return true;
		return false;
	}
 }