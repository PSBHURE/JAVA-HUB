public class StringCopy
{
	public static void main(String[] args)
	{
		String str1="PRATIK SURESH BHURE";
		String str2=copy(str1);
		System.out.println(str2);
		System.out.println(str2.toLowerCase());
		System.out.println(str2.toUpperCase());
	}
	public static String copy(String str)
	{
		return new String(str);
	}
}