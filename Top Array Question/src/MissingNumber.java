public class MissingNumber
{
	public static void main(String[] args)
	{
		int arr[]={1,2,3,4,6,7};
		missingNo(arr);
	}
	public static void missingNo(int[] arr)
	{
	int count=0;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=0;j<arr.length;j++)
			{
			 if(arr[j]!=arr[i]+1)
			  count++;
			}
			if(count>=arr.length)
			{
				System.out.println(arr[i]+1);
				break;
			}
		}
	}
}