public class StringRange
{
	public static void main(String[] args)
	{
		String str="this is test string";
		System.out.println(Substring(str,9,4));
	}
	public static String Substring(String str,int start,int upto)
	{
		return str.substring(start-1,start+upto);
	}
}
