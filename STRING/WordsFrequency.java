import java.util.*;
public class WordsFrequency
{
	public static void main(String[] args)
	{
		String str="The string where the word the present more than once.";
		Map<String,Integer>map=WORDSFREQUENCY(str);
		for(Map.Entry<String,Integer>entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
	}
	public static Map<String,Integer> WORDSFREQUENCY(String str)
	{
		String str2=str.toLowerCase();
		Map<String,Integer>map=new HashMap<>();
		String[] arr=str2.split("\\s+");
		for(String sc:arr)
		{
		map.put(sc,map.getOrDefault(sc,0)+1);
		}
		return map;
	}
}