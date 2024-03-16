/*33. Write a Java program to remove duplicate
 elements from a given array and return the updated 
 array length.
Sample array: [20, 20, 30, 40, 50, 50, 50]
After removing the duplicate elements the program
 should return 4 as the new length of the array. */
  
  import java.util.*;
 public class Que33
 {
	public static void main(String[] args)
	{
		int[] arr={20,20,30,40,50,50,50};
		int[] arr1=SingleElements(arr);
		System.out.print(Arrays.toString(arr1));
	}
	public static int[] SingleElements(int[] arr)
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