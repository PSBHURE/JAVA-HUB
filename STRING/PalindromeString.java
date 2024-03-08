import java.util.*;
public class PalindromeString
{
	public static void main(String[] args)
	{
		System.out.println(StringPalindrome("0p"));
		System.out.println(StringPalindrome("A man, a plan, a canal: Panama"));
	}
	public static boolean StringPalindrome(String str)
	{
		if(str.isEmpty())
			return true;
		char[] arr=str.toCharArray();
		List<Character>list=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>='a'&&arr[i]<='z')||(arr[i]>='A'&&arr[i]<='Z')||(arr[i]>='0'&&arr[i]<='0'))
			list.add(Character.toLowerCase(arr[i]));
			else 
				continue;
		}
		int begin=0,end=list.size()-1;
		while(begin<end)
		{
			if(list.get(begin)!=list.get(end))
				return false;
			begin++;
			end--;
		}
		return true;
	}
}