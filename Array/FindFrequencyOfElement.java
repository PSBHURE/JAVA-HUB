import java.util.*;
public class FindFrequencyOfElement
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5,1,2,3,4,1};
		Map<Integer,Integer> map=FindFrequency(arr);
		for(Map.Entry<Integer,Integer>entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
	}
	public static Map<Integer,Integer> FindFrequency(int[] arr)
	{
		Map<Integer,Integer>map=new HashMap<>();
		for(int num:arr)
		{
			map.put(num,map.getOrDefault(num,0)+1);
		}
		return map;
	}
}