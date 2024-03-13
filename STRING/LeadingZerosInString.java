import java.util.*;
public class LeadingZerosInString
{
	public static void main(String[] args)
	{
		String str="1 0 20 0 10 89 100 0 11 0 22";
		System.out.print(ArrangeZerosAtBegin(str));
		
	}
	public static String ArrangeZerosAtBegin(String str)
	{
		String[] arr=str.split("\\s+");
		String temp="\0";
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(Integer.parseInt(arr[i])==0&&Integer.parseInt(arr[j])!=0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return String.join(" ",arr);
	}
}

	