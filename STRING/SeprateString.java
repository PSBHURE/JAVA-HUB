public class SeprateString
{
	public static void main(String[] args)
	{
		String str="w3resource.com";
		//String str2=StringSepration(str);
		StringSepration(str);
		//System.out.printlm(str2);
	}
	public static void StringSepration(String str)
	{
	char[] arr=str.toCharArray();
	for(char i:arr)
	{
	System.out.print(i+" ");
	}
	}
	
}