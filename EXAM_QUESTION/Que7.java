public class Que7
{
	public static void main(String[] args)
	{
		String str1="abcd";
		String str2="hijklmn";
		System.out.println(StringAlternation(str1,str2));
	}
	public static String StringAlternation(String str1,String str2)
	{
		StringBuffer temp=new StringBuffer();
		int length=Math.max(str1.length(),str2.length());
		for(int i=0;i<length;i++)
		{
			if(i<str1.length())
			temp.append(str1.charAt(i));
			if(i<str2.length())
			temp.append(str2.charAt(i));
			
		}
		return new String(temp);
	}
}







