//Write a Java program to remove a specific element from an array.
import java.util.*;
public class Que7
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		int[] arr1=(Remove(arr,8));
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}
	public static int[] Remove(int[] arr,int no)
	{
	int[] arr1=new int[arr.length-1];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==no)
			continue;
			arr1[j]=arr[i];
			j++;
		}
		return arr1;
	}
}