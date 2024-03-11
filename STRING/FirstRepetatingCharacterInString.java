import java.util.*;
public class FirstRepetatingCharacterInString
{
	public static void main(String[] str)
	{
	System.out.print(FirstRepitedCharacter("w3resource"));
	}
	public static char FirstRepitedCharacter(String str)
	{
		char[] arr=str.toCharArray();
		Map<Character,Integer>map=new HashMap<>();
		for(char ch:arr)
		{
			if(map.containsKey(ch))
				return ch;
			else
				map.put(ch,1);
		}
		return '\0';
	}
}