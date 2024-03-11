public class StringReplacement
{
	public static void main(String[] str)
	{
		System.out.println(REPLACEMENT("Be glad to see the back of Input replace character "," ","*"));
	}
	public static String REPLACEMENT(String str1,String str2,String str3)
	{
		return str1.trim().replaceAll(str2,str3);
	}
	
}