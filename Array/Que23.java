/*23. Write a Java program to test two arrays' 
equality.*/
import java.util.*;
public class Que23
{
	public static void main(String[] args)
	{
		//int[] arr1={10,20,30,40,50,5};
		int[] arr1={10,20,30,40,50,5};
		int[] arr2={10,20,30,40,50};
		System.out.println(TwoArrayTesting(arr1,arr2));
	}
	public static boolean TwoArrayTesting(int[] arr1,int[] arr2)
	{
		if(arr1.length!=arr2.length)
		return false;
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=arr2[i])
			return false;
		}
		return true;
	}
}