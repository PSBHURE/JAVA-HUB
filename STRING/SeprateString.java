public class SeprateString
{
	public static void main(String[] args)
	{
		String str="w3resource.com";
		StringSepration(str);
	}
	public static void StringSepration(String str)
	{
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");
		}
	
	}
}