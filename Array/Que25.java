/*25. Write a Java program to find common elements in
 three sorted (in non-decreasing order) arrays.*/
 import java.util.*;
 public class Que25
 {
	public static void main(String[] args)
	{
	int arr1[]={10,20,30,40,50,60,70,80,90,100};
	int arr2[]={10,30,50,70,90,60,80,20};
	int arr3[]={20,40,60,80,100};
	int[] arr4=CommonElementsBetweenThreeArrays(arr1,arr2,arr3);
	System.out.println(Arrays.toString(arr4));
	}
	public static int[] CommonElementsBetweenThreeArrays(int[] arr1,int[] arr2,int[] arr3)
	{
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					if(list.contains(arr1[i]))
					continue;
					list.add(arr1[i]);
				}
			}
		}
		int[] arr4=new int[list.size()];
		for(int l=0;l<arr4.length;l++)
		{
			arr4[l]=list.get(l);
		}
		
		list.clear();
		
		for(int x=0;x<arr3.length;x++)
		{
			for(int y=0;y<arr4.length;y++)
			{
				if(arr3[x]==arr4[y])
				{
					list.contains(arr3[x]);
					continue;
					list.add(arr3[x]);
					
				}
			}
		}
		int[] arr5=new int[list.size()];
		for(int z=0;z<arr5.length;z++)
		{
				arr5[z]=list.get(z);
		}
		
		return arr5;
	}
 }