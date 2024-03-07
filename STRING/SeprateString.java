public class SeprateString
{
	public static void main(String[] args)
	{
		String str="www.w3resource.com";
		System.out.print(StringSepration(str));
	}
	public static String StringSepration(String str)
	{
			char[] arr=str.toCharArray();
			StringBuffer s=new StringBuffer();
			for(char i:arr)
			{
					s.append(i).append(" ");
			}
			return String.valueOf(s);
	}
}