import java.util.*;
public class Que8
{
	public static void main(String[] args)
	{
		String str1="world is beautiful place";
		System.out.println(StringAlternation(str1));
	}
	public static String StringAlternation(String str)
	{
		char[] arr=str.toCharArray();
	
		int start=0,end=arr.length-1;
		char temp='\0';
		while(start<end)
		{
			if(arr[start]==' ')
			{
			start++;
			}
			if(arr[end]==' ')
			{
			end--;
			}
			else
			{
				temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		}
		return String.valueOf(arr);
	}
}