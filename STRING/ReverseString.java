public class ReverseString
{
	public static void main(String[] args)
	{
		String str="www.w3resource.com";
		System.out.println(StringReverse(str));
	}
	public static String StringReverse(String str)
	{
		char[] arr=str.toCharArray();
		int start=0;
		int end=arr.length-1;
		char temp='a';
		while(start<end)
		{
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;		
		}
		return String.valueOf(arr);
	}
}