import java.util.*;
public class Que6
{
	public static void main(String[] args)
	{
		String str="-3 1 2 3 3 5 8 15";
		System.out.println(TwoSum(str,6));
	}
	public static String TwoSum(String str,int target)
	{
		String[] arr=str.split("\\s+");
		int start=0,end=arr.length-1,sum=0;
		List<String>list=new ArrayList<>();
		while(start<end)
		{
			sum=Integer.parseInt(arr[start])+Integer.parseInt(arr[end]);
			
			if(sum>target)
			end--;
			if(sum<target)
			start++;
			if(sum==target)
			{
				list.add(arr[start]+","+arr[end]);
				start++;
				end--;
			}
		}
		return String.join(":",list);
	}
}