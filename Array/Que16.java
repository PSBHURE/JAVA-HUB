/*16. Write a Java program to remove duplicate 
elements from an array.*/
import java.util.*;
public class Que16
{
	public static void main(String[] args)
	{
		int[] arr={10,20,0,20,40,50,40,10,50,80};
		int[] arr1=RemoveDuplicate(arr);
		System.out.print(Arrays.toString(arr1));
	}
	public static int[] RemoveDuplicate(int[] arr)
	{
		Set<Integer>set=new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		int[] arr1=new int[set.size()];
		int j=0;
		for(int x:set)
		{
			arr1[j]=x;
			j++;
		}
		return arr1;
	}
}
