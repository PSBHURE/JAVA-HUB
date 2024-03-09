public class TrailingZero
{
	public static void main(String[] args)
	{
		int[] arr={0,1,0,3,12};
		swapzeros(arr);
	}
	public static void swapzeros(int[] arr)
	{
	int left=0,right=0,temp=0;
		while(right<arr.length)
		{
			if(arr[right]!=0)
			{
			  temp=arr[left];
			  arr[left]=arr[right];
			  arr[right]=temp;
			  left++;
			}
			right++;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}