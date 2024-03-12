import java.util.*;
public class DuplicateElement
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,2,3,4,5,4,6,8,0};
		int[] arr2=DUPLICATE_ELEMENT(arr);
		for(int j=0;j<arr2.length;j++)
		{
			System.out.print(arr2[j]+" ");
		}
	}
	public static int[] DUPLICATE_ELEMENT(int[] arr)
		{
		Map<Integer,Integer>map=new HashMap<>();
		int count=0;
		for(int i:arr)
		{
			map.put(i,map.getOrDefault(i,0)+1);
		}
		ArrayList<Integer>list=new ArrayList<>();
		for(Map.Entry<Integer,Integer>entry:map.entrySet())
		{
			if(entry.getValue()>1)
			list.add(entry.getKey());
		}
		int[] arr1=new int[list.size()];
		int i=0;
		for(int x:list)
		{
			arr1[i]=x;
			i++;
		}
		return arr1;
	}
}