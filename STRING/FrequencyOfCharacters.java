import java.util.*;
public class FrequencyOfCharacters
{
	public static void main(String[] args)
	{
	String str="Welcome to w3resource.com";
		Map<Character,Integer>freq=CharFrequecy(str);
		for(Map.Entry<Character,Integer>entry:freq.entrySet())
		{
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
	}
	public static Map<Character,Integer> CharFrequecy(String str)
	{
		char[] arr=str.toCharArray();
		Map<Character,Integer> freq=new HashMap<>();
		
		for(char ch:arr)
		{
			freq.put(ch,freq.getOrDefault(ch,0)+1);
		}
		return freq;
	}
}
