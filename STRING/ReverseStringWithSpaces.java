public class ReverseStringWithSpaces
{
	public static void main(String[] args)
	{
		String str="DIVYANI";//"BHEDRA";//"MRUNALI";//"PRATIK";//"www.w3resource.com";
		System.out.print("your reverse string with spaces=>"+ReverseString(str));
	}
	public static String ReverseString(String str)
	{
		StringBuffer str1=new StringBuffer();
		for(int i=str.length()-1;i>=0;i--)
		{
				str1.append(str.charAt(i)).append(" ");
		}
		return str1.toString();
	}
}
