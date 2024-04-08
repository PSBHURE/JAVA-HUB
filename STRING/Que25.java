import java.util.*;
public class Que25
{
	public static void main(String[] args)
	{
		String str="PRATIK SURESH BHURE";
		System.out.println(check(str));
	}
	public static String check(String str)
	{
		List<Character> list=new ArrayList<>();
		for(int i=0;i<str.length();i++)
		{
			list.add(str.charAt(i));
		}
		ListIterator<Character>iterator=list.listIterator();
		while(iterator.hasNext())
		{
			char ch=iterator.next();
			if(ch=='U')
				iterator.remove();
		}
		char[] arr=new char[list.size()];
		for(int j=0;j<arr.length;j++)
		{
			arr[j]=list.get(j);
		}
		return String.valueOf(arr);
	}
}