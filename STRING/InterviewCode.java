import java.util.*;
public class InterviewCode
{
	public static void main(String[] args)
	{
		String str1="04-10-1998";
		String str2="18-03-2024";
		System.out.println("no of days between this two dates="+NoOfDays(str1,str2));
	}
	public static int NoOfDays(String str1,String str2)
	{
		int sum=0;
		String[] arr3=str1.split("-");
		String[] arr4=str2.split("-");
		String[] arr5=new String[arr3.length];
		for(int i=0;i<arr3.length;i++)
		{
		arr5[i]=String.valueOf(Math.abs(Integer.parseInt(arr3[i])-Integer.parseInt(arr4[i])));	
		}
		
		sum=Integer.parseInt(arr5[0])+Integer.parseInt(arr5[1])*30+Integer.parseInt(arr5[2])*365;
		return sum;
	}
}
