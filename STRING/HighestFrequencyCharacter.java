import java.util.*;
public class HighestFrequencyCharacter
{
	public static void main(String[] args)
	{
		String str="Welcome to w3resource.com.";
		Map<Character,Integer> map=MaxOccurChar(str);
		for(Map.Entry<Character,Integer>entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
	}
	public static Map<Character,Integer> MaxOccurChar(String str)
	{
		char[] arr=str.toCharArray();
		Map<Character,Integer>map=new HashMap<>();
		for(char ch:arr)
		{
			if(ch!=' ')
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		int max=0;
		char cmax='\0';
		Map<Character,Integer>complete=new HashMap<>();
		for(Map.Entry<Character,Integer>entry:map.entrySet())
		{
			if(entry.getValue()>max)
			{
				max=entry.getValue();
				cmax=entry.getKey();
			}
		}
		complete.put(cmax,max);
		return complete;
	}
	
}