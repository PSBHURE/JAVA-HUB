import java.util.*;
public class Amstrong
{
	public static void main(String[] args)
	{
		int no=153;
		System.out.println(isAmstrong(no));
	}
	public static boolean isAmstrong(int no)
	{
		int temp=no,r=0;
		double sum=0;
		String str=String.valueOf(no);
		int l=str.length();
		while(no!=0)
		{
			r=no%10;
			no=no/10;
			sum=sum+Math.pow(r,l);
		}
		if(temp==sum)
		return true;
	else
		return false;
	}
}