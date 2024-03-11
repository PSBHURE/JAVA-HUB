public class LargestWordInString
{
	public static void main(String[] args)
	{
		String str="It is a string with smallest and largest word.";
		int[] arr=LargestAndSmallestWordsInString(str);
		System.out.print("max length="+arr[0]+" , "+"min length="+arr[1]);
	}
	public static int[] LargestAndSmallestWordsInString(String str)
	{
		String[] arr=str.split("\\s+");
		int min=Integer.MAX_VALUE,max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()>max)
			max=arr[i].length();
			else if(arr[i].length()<min)
			min=arr[i].length();
		}
		int[] arr1=new int[2];
		arr1[0]=max;
		arr1[1]=min;
		return arr1;
	}
}