public class MAXSUM
{
	public static void main(String[] args)
	{
		int[] arr={1,9,-1,-2,7,3,-1,2};
		System.out.println(MaxSum(arr,4));
	}
	public static int MaxSum(int[] arr,int k)
	{
		 int msum=0,wsum=0;
		for(int i=0;i<k;i++)
		{
		 wsum=wsum+arr[i];
		}
		for(int end=k;end<arr.length;end++)
		{
		 wsum+=arr[end]-arr[end-k];	
		 if(wsum>msum)
		msum=wsum;
		}
		
		return msum;
	}
}