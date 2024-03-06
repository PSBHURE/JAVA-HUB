public class ReverseString
{
	public static void main(String[] args)
	{
		String str="w3resource.com";
		System.out.print("your reverse string=>"+StringReverse(str));
	}
		
	public static String StringReverse(String str)
	{
		char[] arr=str.toCharArray();
		int begin=0;
		int end=arr.length-1;
		char temp='a';
		while(end>begin)
		{
		temp=arr[begin];
		arr[begin]=arr[end];
		arr[end]=temp;
		begin++;
		end--;		
		}
		return String.valueOf(arr);
	}
}