public class LengthCount
{
	public static void main(String[] args)
	{
	String str="w3resource.com";
	int length=CountLength(str);
	System.out.println("Length of the string is :"+length);
	}
	public static int CountLength(String str)
	{
		int count=0;
		char[] arr=str.toCharArray();
		for(char i:arr)
		{
		count++;
		}
		return count;
	}
}