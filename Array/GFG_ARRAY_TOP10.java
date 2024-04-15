/*Union and Intersection of two sorted arrays
Last Updated : 09 Oct, 2023
Given two sorted arrays, find their union and intersection.

Example:

Input: arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6} 
Output: Union : {1, 2, 3, 4, 5, 6, 7} 
         Intersection : {3, 5}

Input: arr1[] = {2, 5, 6}
        arr2[] = {4, 6, 8, 10} 
Output: Union : {2, 4, 5, 6, 8, 10} 
         Intersection : {6}*/
		 
import java.util.*;
public class GFG_ARRAY_TOP10
{
	public static void main(String[] args)
	{
		int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6} ;
		function(arr1,arr2);
	}
	public static void function(int[] arr1,int[] arr2)
	{
		//int[int[]] zero=new int[2];
		Set<Integer>union=new HashSet<>();
		for(int x:arr1)
		union.add(x);
		
		for(int y:arr2)
		union.add(y);
		
		int[] unionarray=new int[union.size()];
			int i=0;
		for(int z:union)
		{
			unionarray[i]=z;
			i++;
		}
		
		List<Integer>list1=new ArrayList<>();
		for(int w:arr1)
		{list1.add(w);}
		
		List<Integer>list2=new ArrayList<>();
		for(int u:arr2)
		{list2.add(u);}
		
		List<Integer>list3=new ArrayList<>();
		for(int j=0;j<arr1.length;j++)
		{
			if(list1.contains(arr1[j])&&list2.contains(arr1[j]))
			list3.add(arr1[j]);
		}
		
		for(int k=0;k<arr2.length;k++)
		{
			if(list1.contains(arr2[k])&&list2.contains(arr2[k]))
			list3.add(arr2[k]);
		}
		
		
		
		union.clear();
		for(int q:list3)
		{
				union.add(q);
		}
		
		System.out.print("union of two arrays=>");
		for(int t=0;t<unionarray.length;t++)
		{
			System.out.print(unionarray[t]+" ");
		}
		System.out.println();
		System.out.print("intersection of two arrays=>");
		for(int m:union)
		{
			System.out.print(m+" ");
		}
	}
}