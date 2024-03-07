public class StringChecking
{
	public static void main(String[] args)
	{
	boolean flag=(StringEquals("PRATIK","pratik"));
	System.out.println(flag);
	}
	public static boolean StringEquals(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		return false;
		
		if(s1.equals(s2))
		return true;
		
		else
		return false;
	}
}