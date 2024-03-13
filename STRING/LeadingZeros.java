import java.util.*;
public class LeadingZeros
{
	public static void main(String[] args)
	{
		String str="1 0 20 0 10 89 100 0 11 0 22";
		System.out.print(ArrangeZerosAtBegin(str));
	}
	public static String ArrangeZerosAtBegin(String str)
	{
		String[] arr=str.split("\\s+");
		int left=0;
		int right=0;
		String temp="\0";
		while(right<arr.length)
		{
			if(Integer.parseInt(arr[right])!=0)
			{
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
			}
			right++;
		}
		return String.join(" ",arr);
	}
}