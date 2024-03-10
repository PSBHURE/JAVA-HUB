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
		ArrayList<Character>list=new ArrayList<>();
		for(int j=0;j<arr.length;j++)
		{
			list.add(arr[j]);
		}
		
		for(int w=0;w<list.size();w++)
		{
			if((list.get(w)>='a'&&list.get(w)<='z')||(list.get(w)>='A'&&list.get(w)<='Z'))
			{
			
			}
			else
			 list.remove(list.get(w));
		}
		char[] arr1=new char[list.size()];
		for(int z=0;z<list.size();z++)
		{
			arr1[z]=list.get(z);
		}
		return String.valueOf(arr1);
	}
	//wresourcecom
}