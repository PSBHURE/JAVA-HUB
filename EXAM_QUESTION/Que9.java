public class Que9
{
	public static void main(String[] args)
	{
		int[] arr={0,1,2,3,0,30,0,0,89,0};
		int[] arr1=TrailingZeros(arr);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}
	public static int[] TrailingZeros(int[] arr)
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
		return arr;
	}
}