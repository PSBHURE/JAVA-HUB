/*12. Write a Java program to find duplicate values 
in an array of integer values.*/
import java.util.*;
public class Que12
{
	public static void main(String[] args)
	{
		int[] arr={10,20,30,40,50,10,20};
		int[] arr2=DuplicateElement(arr);
		for(int i=0;i<arr2.length;i++)
		{
		System.out.print(arr2[i]+" ");
		}
	}
	public static int[] DuplicateElement(int[] arr)
	{
		Map<Integer,Integer>map=new LinkedHashMap<>();
		List<Integer>list=new ArrayList<>();
		for(int x:arr)
		{
			map.put(x,map.getOrDefault(x,0)+1);
		}
		for(Map.Entry<Integer,Integer>entry:map.entrySet())
		{
			if(entry.getValue()>1)
			list.add(entry.getKey());
		}
		int[] arr1=new int[list.size()];
		
		for(int j=0;j<list.size();j++)
		{
			arr1[j]=list.get(j);
			
		}
		return arr1;
	}
}