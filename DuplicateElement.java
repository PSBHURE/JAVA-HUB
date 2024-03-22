import java.util.*;
public class DuplicateElement
{
	public static void main(String[] args)
	{
		int[] arr={5,2,7,7,5};
		int[] arr1=FindDuplicate(arr);
		System.out.println(Arrays.toString(arr1));
	}
	public static int[] FindDuplicate(int[] arr)
	{
		Map<Integer,Integer>map=new LinkedHashMap<>();
		for(int x:arr)
		{
			map.put(x,map.getOrDefault(x,0)+1);
		}
		List<Integer>list=new ArrayList<>();
		for(Map.Entry<Integer,Integer>entry:map.entrySet())
		{
			if(entry.getValue()>1)
			list.add(entry.getKey());
		}
		int[] arr2=new int[list.size()];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=list.get(i);
		}
		return arr2;
	}
}