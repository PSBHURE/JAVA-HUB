public class LargestWordInStringNew
{
	public static void main(String[] args)
	{
		String str="It is a string with smallest and largest word.";
		String[] arr=LargestAndSmallestWordsInString(str);
		System.out.print("max length="+arr[0]+" , "+"min length="+arr[1]);
	}
	public static String[] LargestAndSmallestWordsInString(String str)
	{
		String[] arr=str.split("\\s+");
		int min=Integer.MAX_VALUE,max=0,imin=0,imax=0;
		String smin="\0",smax="zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()>max)
			{
			max=arr[i].length();
			imax=i;
			}
			
			else if(arr[i].length()<min)
			{
			min=arr[i].length();
			imin=i;
			}
		}
		String[] arr1=new String[2];
		arr1[0]=arr[imax];
		arr1[1]=arr[imin];
		return arr1;
	}
}