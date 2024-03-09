import java.util.*;
public class HighestFrequencyCharacter
{
	public static void main(String[] args)
	{
		String str="Welcome to w3resource.com.";
		Map<Character,Integer>frequecy=MaxOccurChar(str);
		for(Map.Entry<Character,Integer>freq:frequecy.entrySet())
		{
			System.out.println(freq.getKey()+"->"+freq.getValue());
		}
	}
	public static Map<Character,Integer> MaxOccurChar(String str)
	{
		char[] arr=str.toCharArray();
		Map<Character,Integer>map=new HashMap<>();
		for(char ch:arr)
		{
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
				map.put(ch,map.getOrDefault(ch,0)+1);
		}
		char maxchar='\0';
		int max=0;
		for(Map.Entry<Character,Integer>check:map.entrySet())
		{
			if(check.getValue()>max)
			{
				max=check.getValue();
				maxchar=check.getKey();
			}
		}
		Map<Character,Integer>finish=new HashMap<>();
		finish.put(maxchar,max);
		return finish;
	}
}