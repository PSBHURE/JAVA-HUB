/*31. Write a Java program to check if the sum of 
all the 10's in the array is exactly 30. Return 
false if the condition does not satisfy, otherwise
 true.*/
 
 import java.util.*;
 public class Que31
 {
	public static void main(String[] args)
	{
		int[] arr={10,77,10,54,-11,10};
		System.out.print(checking(arr));
	}
	public static boolean checking(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==10)
			sum+=arr[i];
		}
		if(sum!=30)
		return false;
	return true;
	}
 }