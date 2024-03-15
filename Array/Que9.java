/*9. Write a Java program to insert an element 
(specific position) into an array.*/
import java.util.*;
public class Que9
{
	public static void main(String[] args)
	{
		int[] arr1={10,20,30,40,50};
		int[] arr2=Insertion(arr1,55,4);
		for(int i=0;i<arr2.length;i++)
		{
		System.out.print(arr2[i]+" ");
		}
	}
	public static int[] Insertion(int[] arr,int no,int index)
	{
		int[] arr1=new int[arr.length+1];
		for(int i=0;i<arr1.length;i++)
		{
			if(i<index)
			arr1[i]=arr[i];
			if(i==index)
			arr1[i]=no;
			if(i>index)
			arr1[i]=arr[i-1];
		}
		return arr1;
	}
}