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
		/*List<Integer>list=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==' ')
			{
			list.add(i);
			}
		}*/
		int start=0,end=arr.length-1;
		char temp='\0';
		while(start<end)
		{
			if(arr[start]==' ')
			{
			start++;
			//continue;
			}
			if(arr[end]==' ')
			{
			end--;
			//continue;
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