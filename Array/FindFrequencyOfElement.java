import java.util.*;
public class FindFrequencyOfElement
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,2,3,2,5,7,8,1,2,8,0,8,6,8};
		Map<Integer,Integer>map=FindFrequency(arr);
		for(Map.Entry<Integer,Integer>entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
	}
	public static Map<Integer,Integer> FindFrequency(int[] arr)
	{
			Map<Integer,Integer>map=new HashMap<>();
			for(int element:arr)
			{
				map.put(element,map.getOrDefault(element,0)+1);
			}
			return map;
	}
}