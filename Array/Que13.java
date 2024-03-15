

import java.util.*;
public class Que13
{
	public static void main(String[] args)
	{
		String[] arr={"bcd","abd","jude","bcd","oiu","jude"};
		String[] arr2=DuplicateElement(arr);
		for(int i=0;i<arr2.length;i++)
		{
		System.out.print(arr2[i]+" ");
		}
	}
	public static String[] DuplicateElement(String[] arr)
	{
		Map<String,Integer>map=new LinkedHashMap<>();
		List<String>list=new ArrayList<>();
		for(String x:arr)
		{
			map.put(x,map.getOrDefault(x,0)+1);
		}
		for(Map.Entry<String,Integer>entry:map.entrySet())
		{
			if(entry.getValue()>1)
			list.add(entry.getKey());
		}
		String[] arr1=new String[list.size()];
		
		for(int j=0;j<list.size();j++)
		{
			arr1[j]=list.get(j);
			
		}
		return arr1;
	}
}