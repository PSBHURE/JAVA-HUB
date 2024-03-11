public class StringInbuildMethods
{
	public static void main(String[] args)
	{
		System.out.println(TOUPPERCASE(" the quick brown fox jumps over the lazy dog"));
		System.out.println(TOLOWERCASE(" THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG."));
	}
	public static String TOUPPERCASE(String str)
	{
		return str.toUpperCase();
	}
	public static String TOLOWERCASE(String str)
	{
		return str.toLowerCase();
	}
}