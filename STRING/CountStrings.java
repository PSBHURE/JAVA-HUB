import java.util.*;
public class CountStrings
{
	public static void main(String[] args)
	{
		String str="The string where the word the present more than once.";
		System.out.println(StringCount(str,"the"));
	}
	public static int StringCount(String str,String str1)
	{
	 String[] words=str.split("\\s+");
	 int count=0;
	 for(int i=0;i<words.length;i++)
	 {
		if(words[i].toLowerCase().equals(str1.toLowerCase())) 
			count++;
	 }
	 return count;
	}
}