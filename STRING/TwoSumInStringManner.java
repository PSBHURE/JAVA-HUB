import java.util.*;
public class TwoSumInStringManner
{
	public static void main(String[] args)
	{
		String str="-3 1 2 3 3 5 8 15";
		System.out.print(TwoSum(str,6));
		
	}
	public static String TwoSum(String str,int target)
	{
		String[] arr=str.split("\\s+");
		List<String>list=new ArrayList<>();
		int start=0,end=arr.length-1,sum=0;
		while(start<end)
		{
			sum=Integer.parseInt(arr[start])+Integer.parseInt(arr[end]);
			if(sum<target)
				start++;
			else if(sum>target)
				end--;
			else if(sum==target)
			{
				list.add(arr[start]+","+arr[end]);
				start++;
			}
		}
		return String.join(":",list);
	}
}