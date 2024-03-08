public class MAXSUM
{
	public static void main(String[] args)
	{
		int[] arr={1,9,-1,-2,7,3,-1,2};
		System.out.print(MaxSum(arr,4));
	}
	public static int MaxSum(int[] arr,int k)
	{
	 int wsum=0,msum=0;
	 for(int i=0;i<k;i++)
	 {
		wsum+=arr[i];
	 }
	 for(int end=k;end<arr.length;end++)
	 {
		wsum+=arr[end]-arr[end-k];
		msum=Math.max(wsum,msum);
	 }
	 return msum;
	}
}