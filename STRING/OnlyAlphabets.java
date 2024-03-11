import java.util.*;
public class OnlyAlphabets
{
	public static void main(String[] str)
	{
		System.out.println(ONLYALPHABETS("w3resource.com"));
	}
	public static String ONLYALPHABETS(String str)
	{
		char[] arr=str.toCharArray();
		List<Character>list=new ArrayList();
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>='a'&&arr[i]<='z')||(arr[i]>='A'&&arr[i]<='Z'))
			{
				list.add(arr[i]);
			}
		}
		char[] arr1=new char[list.size()];
		for(int i=0;i<list.size();i++)
		{
			arr1[i]=list.get(i);
		}
		return String.valueOf(arr1);
	}
	//wresourcecom
}