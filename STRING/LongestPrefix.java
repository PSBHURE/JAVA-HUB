import java.util.*;
public class LongestPrefix
{
	public static void main(String[] args)
	{
	String[] str={"cluster","clue","clutch","club","clumsy"};
	System.out.print(LONGESTPREFIX(str));
	}
	public static String LONGESTPREFIX(String[] str)
	{
		Arrays.sort(str);
		StringBuffer prefix=new StringBuffer();
		//prefix="";
		for(int i=0;i<str[0].length();i++)
		{
			if(str[0].charAt(i)!=str[str.length-1].charAt(i))
			break;
			prefix.append(str[0].charAt(i));
			
		}
		return String.valueOf(prefix);
	}
}