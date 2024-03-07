public class ReverseStringWithSpaces
{
	public static void main(String[] args)
	{
			String str="www.w3resource.com";
			System.out.printf(StringReversing(str));
	}
	public static String StringReversing(String str)
	{
			char[] arr=str.toCharArray();
			StringBuffer s=new StringBuffer();
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
			for(char j:arr)
			{
					s.append(j).append(" ");
			}
			return String.valueOf(s);
	}
}
