//15. Write a Java program to find common elements between two integer arrays.
import java.util.*;
public class Que15
{
	public static void main(String[] args)
	{
		int[] arr1={10,20,30,40,50,60,70};
		int[] arr2={10,30,50,70,90,100};
		int[] arr3=CommonElement(arr1,arr2);
		for(int i=0;i<arr3.length;i++)
		{
		System.out.print(arr3[i]+" ");
		}
	}
	public static int[] CommonElement(int[] arr1,int[] arr2)
	{
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				list.add(arr1[i]);
			}
		}
		int[] arr3=new int[list.size()];
		for(int j=0;j<list.size();j++)
		{
			arr3[j]=list.get(j);
		}
		return arr3;
	}
}