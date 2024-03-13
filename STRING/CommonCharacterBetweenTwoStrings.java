import java.util.*;
public class CommonCharacterBetweenTwoStrings
{
	public static void main(String[] args)
	{
		String str1="hello every one";
		String str2="world is happy now";
		String str=COMMONCHARACTERBETWEENTWOSTRINGS(str1,str2);
		System.out.println(str);
	}
	public static String COMMONCHARACTERBETWEENTWOSTRINGS(String str1,String str2)
	{
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		//Set<Character>set=new HashSet<>();
		Set<Character>set=new LinkedHashSet<>();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==' '||arr2[j]==' ')
				continue;
				if((arr1[i]==arr2[j]))
				set.add(arr1[i]);
				
			}
		}
		char[] arr3=new char[set.size()];
		int k=0;
		for(char ch:set)
		{
			arr3[k]=ch;
			k++;
		}
		return String.valueOf(arr3);
	}
}