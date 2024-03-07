/*public class StringChecking
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
}*/



public class StringChecking
{
	public static void main(String[] args)
	{
	boolean flag=(StringEquals("PRATIK","PRATIK"));
	System.out.println(flag);
	}
	public static boolean StringEquals(String s1,String s2)
	{
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		if(arr1.length!=arr2.length)
			return false;
		for(int i=0;i<arr1.length-1;i++)
		{
			if(arr1[i]!=arr2[i])
				return false;
		}
		return true;
	}
}