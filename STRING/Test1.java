import java.util.*;
public class InterviewCode
{
	public static void main(String[] args)
	{
		String str1="01-01-2020";
		String str1="01-01-2021";
		System.out.println("no of days between this two dates="+NoOfDays(str1,str2));
	}
	public static int NoOfDays(String str1,String str2)
	{
		int sum=0;
		String[] str3=str1.split("-");
		String[] str4=str2.split("-");
		String[] str5=new String[str1.length];
		for(int i=0;i<arr1.length;i++)
		{
		str5[i]=Math.abs(Integer.parseInt(arr3[i])-Integer.parseInt(arr4[i]));	
		}
		
		sum=Integer.parseInt(arr5[0])+Integer.parseInt(arr5[1])*30+Integer.parseInt(arr5[i])*365;
		return sum;
	}
}