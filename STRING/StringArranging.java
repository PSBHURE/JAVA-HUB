public class StringArranging
{
	public static void main(String[] args)
	{
		String str="www.w3resource.com";
		System.out.println(StringSortation(str));
	}
	public static String StringSortation(String str)
	{
		char[] arr=str.toCharArray();
		char temp='\0';
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((int)arr[i]>(int)arr[j])
				{
			 	temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		return String.valueOf(arr);
	}
}//..3cceemoorrsuwwww