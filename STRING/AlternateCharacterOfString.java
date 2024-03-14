public class AlternateCharacterOfString
{
	public static void main(String[] args)
	{
		String s1="hijklmno",s2="abcd";
		System.out.println(ALTERNATE_CHARACTER_OF_STRING(s1,s2));
	}
	public static String ALTERNATE_CHARACTER_OF_STRING(String s1,String s2)
	{
		StringBuffer temp=new StringBuffer();
		int length=Math.max(s1.length(),s2.length());
		for(int i=0;i<length;i++)
		{
			if(i<s1.length())
				temp.append(s1.charAt(i));
				
			if(i<s2.length())
				temp.append(s2.charAt(i));
		}
		return new String(temp);
	}
}