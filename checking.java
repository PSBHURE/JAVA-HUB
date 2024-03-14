import java.util.*;
public class checking
{
	public static void main(String[] args)
	{
	String str="-3 1 2 3 3 5 8 15";
		System.out.print(TwoSum(str,6));
	}
	public static String TwoSum(String str,int target)
	{
		String[] arr=str.split("\\s+");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		System.out.println();
		int start=0,end=arr.length-1,sum=0;
		StringBuffer temp=new StringBuffer();
		while(start<end)
		{
			sum=0;
			sum=Integer.parseInt(arr[start])+Integer.parseInt(arr[end]);
			if(sum>target)
			end--;
			if(sum<target)
			start++;
			else
			{
			temp.append(arr[start]).append(",").append(arr[end]);
			start++;
			end--;
			}
		}
		String s=new String(temp);
		return String.join(";",s);
	}
}