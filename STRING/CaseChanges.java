public class CaseChanges
{
	public static void main(String[] args)
	{
		String str="This Is A Test String.";
		System.out.println(CHANGESEQUENCE(str));
	}
	public static String CHANGESEQUENCE(String str)
	{
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>='a'&&arr[i]<='z')
			{
				arr[i]=(char)(arr[i]-32);
			}
			else if(arr[i]>='A'&&arr[i]<='Z')
			{
				arr[i]=(char)(arr[i]+32);
			}
		}
		return String.valueOf(arr);
	}
}
//output=>tHIS iS a tEST sTRING.