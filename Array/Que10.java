/*10. Write a Java program to find the maximum and 
minimum value of an array.*/
import java.util.*;
public class Que10
{
	public static void main(String[] args)
	{
		int[] arr1={10,20,30,40,50};
		int[] arr2=ArrayCopy(arr1);
		System.out.println("max="+arr2[0]);
		System.out.println("min="+arr2[1]);
	}
	public static int[] ArrayCopy(int[] arr)
	{
		int[] arr1=new int[2];
		int max=0,min=0;
		Arrays.sort(arr);
		arr1[0]=arr[arr.length-1];
		arr1[1]=arr[0];
		return arr1;
	}
}