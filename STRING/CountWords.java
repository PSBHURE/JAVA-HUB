public class CountWords
{
	public static void main(String[] args)
	{
		String str="  My name is PRATIK SURESH BHURE   ";
		System.out.println("no of words in given strin="+StringCounter(str));
	}
	public static int StringCounter(String str)
	{	
		String s=str.trim();
		char[] arr=s.toCharArray();
		int start=0,count=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==' ')
			count++;
		}
		return count+1;
	}
}