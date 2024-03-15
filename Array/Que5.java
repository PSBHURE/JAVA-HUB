//Write a Java program to test if an array contains a specific value.
import java.util.*;
public class Que5
{
	public static void main(String[] args)
	{
	int[] arr={1,2,3,4,5,6,7,8,9,10};
	System.out.println(Exist(arr,8));
	}
	public static boolean Exist(int[] arr,int no)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==no)
			return true;
		}
		return false;
	}
}