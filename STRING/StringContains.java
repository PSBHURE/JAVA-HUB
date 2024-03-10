public class StringContains
{
	public static void main(String[] args)
	{
		String str1="This is a test string.";
		String str2="test";
		if(String_Contains(str1,str2))
		System.out.println("the substring is present");
		else
		System.out.println("the substring is not present");
	}
	public static boolean String_Contains(String str1,String str2)
	{
		return str1.contains(str2);
	}
}